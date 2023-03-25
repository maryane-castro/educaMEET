package com.educaagenda.backend.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.academic.AcademicRequestDTO;
import com.educaagenda.backend.dto.academic.AcademicResponseDTO;
import com.educaagenda.backend.exception.exceptions.ConflictStoreException;
import com.educaagenda.backend.exception.exceptions.EmailValidatorException;
import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.repository.AcademicRepository;
import com.educaagenda.backend.repository.OrganizerRepository;

import jakarta.transaction.Transactional;

@Service
public class AcademicService {

    @Autowired
    AcademicRepository academicRepository;

    @Autowired
    OrganizerRepository organizerRepository;

    public List<Academic> findAll() {
        return academicRepository.findAll();
    }

    public ResponseEntity<Object> findById(Long id) {

        Academic academic = academicRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Acadêmico não encontrado"));
        return ResponseEntity.status(HttpStatus.OK).body(new AcademicResponseDTO(academic));
    }

    @Transactional
    public AcademicResponseDTO save(AcademicRequestDTO academicRequestDTO) {

        Academic academic = academicRequestDTO.toAcademic();

        if (academic.getEmail() != null) {

            var validation = EmailValidatorService.patternMatches(
                    academicRequestDTO.getEmail(),
                    "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
            if (!validation) {
                throw new EmailValidatorException("Formato do e-mail inválido");
            }

            if ((academicRepository.existsByEmail(academic.getEmail())) ||
                    (organizerRepository.existsByEmail(academic.getEmail()))) {
                throw new ConflictStoreException("Este e-mail já está sendo usado!");
            }
        }

        academic.setEmail(academicRequestDTO.getEmail());

        return new AcademicResponseDTO(academicRepository.save(academic));
    }

    @Transactional
    public ResponseEntity<Object> delete(Long id) {

        Academic academic = academicRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Acadêmico não encontrado"));

        if (academic.getEvents().size() > 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    "Não é possível excluir " + academic.getName() + " pois ele está cadastrado(a) em algum Evento");
        }

        academicRepository.delete(academic);

        return ResponseEntity.status(HttpStatus.OK).build();

    }

    @Transactional
    public ResponseEntity<Object> update(Long id, AcademicRequestDTO academicRequestDTO) {

        Academic academic = academicRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Acadêmico não encontrado"));

        // Modificar
        if (academicRequestDTO.getName() != null) {
            academic.setName(academicRequestDTO.getName());
        }

        if (academicRequestDTO.getEmail() != null) {

            var validation = EmailValidatorService.patternMatches(
                    academicRequestDTO.getEmail(),
                    "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

            if (!validation) {
                throw new EmailValidatorException("Formato do e-mail inválido");
            }

            if(academic.getEmail().equals(academicRequestDTO.getEmail())){
            throw new ConflictStoreException("O e-mail informado é o mesmo usado no cadastro!");
            }

            if ((academicRepository.existsByEmail(academicRequestDTO.getEmail())) ||
                    (organizerRepository.existsByEmail(academicRequestDTO.getEmail()))) {
                throw new ConflictStoreException("Este e-mail já está sendo usado!");
            }

            academic.setEmail(academicRequestDTO.getEmail());
        }

        if (academicRequestDTO.getPassword() != null) {
            academic.setPassword(academicRequestDTO.getPassword());
        }

        // Salvar
        AcademicResponseDTO academicResponseDTO = new AcademicResponseDTO(academicRepository.save(academic));
        return ResponseEntity.status(HttpStatus.CREATED).body(academicResponseDTO);

    }

}