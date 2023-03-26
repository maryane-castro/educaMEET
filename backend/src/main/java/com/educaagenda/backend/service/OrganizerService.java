package com.educaagenda.backend.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.organizer.OrganizerRequestDTO;
import com.educaagenda.backend.dto.organizer.OrganizerResponseDTO;
import com.educaagenda.backend.exception.exceptions.ConflictStoreException;
import com.educaagenda.backend.exception.exceptions.EmailValidatorException;
import com.educaagenda.backend.model.Organizer;
import com.educaagenda.backend.repository.AcademicRepository;
import com.educaagenda.backend.repository.EventRepository;
import com.educaagenda.backend.repository.OrganizerRepository;

import jakarta.transaction.Transactional;

@Service
public class OrganizerService {

    @Autowired
    OrganizerRepository organizerRepository;

    @Autowired
    EventRepository eventRepository;

    @Autowired
    AcademicRepository academicRepository;

    public List<Organizer> findAll() {
        return organizerRepository.findAll();
    }

    public ResponseEntity<Object> findById(Long id) {
        Organizer organizer = organizerRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Organizador não encontrado"));
        return ResponseEntity.status(HttpStatus.OK).body(new OrganizerResponseDTO(organizer));
    }

    @Transactional
    public OrganizerResponseDTO save(OrganizerRequestDTO organizerRequestDTO) {

        Organizer organizer = organizerRequestDTO.toOrganizer();

        if (organizer.getEmail() != null) {

            var validation = EmailValidatorService.patternMatches(
                    organizerRequestDTO.getEmail(),
                    "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
            if (!validation) {
                throw new EmailValidatorException("Formato do e-mail inválido");
            }

            if ((organizerRepository.existsByEmail(organizer.getEmail())) ||
                    (academicRepository.existsByEmail(organizer.getEmail()))) {
                throw new ConflictStoreException("Este e-mail já está sendo usado!");
            }
        }

        organizer.setEmail(organizerRequestDTO.getEmail());

        return new OrganizerResponseDTO(organizerRepository.save(organizer));
    }

    @Transactional
    public ResponseEntity<Object> delete(Long id) {

        Organizer organizer = organizerRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Organizador não encontrado"));

        if (organizer.getEvents().size() > 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    "Não é possível excluir " + organizer.getName() + " pois ele está cadastrado(a) em algum Evento");
        }
        organizerRepository.delete(organizer);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Transactional
    public ResponseEntity<Object> update(Long id, OrganizerRequestDTO organizerRequestDTO) {

        Organizer organizer = organizerRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Organizador não encontrado"));

        // Modificar
        if (organizerRequestDTO.getName() != null) {
            organizer.setName(organizerRequestDTO.getName());
        }

        if (organizerRequestDTO.getEmail() != null) {

            var validation = EmailValidatorService.patternMatches(
                    organizerRequestDTO.getEmail(),
                    "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

            if (!validation) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Formato do e-mail inválido");
            }

            // if(organizer.getEmail().equals(organizerRequestDTO.getEmail())){
            // throw new ConflictStoreException("O e-mail informado é o mesmo usado no
            // cadastro!");
            // }

            if (((organizerRepository.existsByEmail(organizerRequestDTO.getEmail())) &&
                    (!organizer.getEmail().equals(organizerRequestDTO.getEmail()))) ||
                    ((academicRepository.existsByEmail(organizerRequestDTO.getEmail())))) {
                throw new ConflictStoreException("Este e-mail já está sendo usado!");
            }

            organizer.setEmail(organizerRequestDTO.getEmail());

        }

        // se password não for a mesma que esta no banco, alterar
        if ((organizerRequestDTO.getPassword() != null) ||
                (!organizerRequestDTO.getPassword().equals(organizer.getPassword()))) {
            organizer.setPassword(new BCryptPasswordEncoder().encode(organizerRequestDTO.getPassword()));
        }
        OrganizerResponseDTO organizerResponseDTO = new OrganizerResponseDTO(organizerRepository.save(organizer));
        return ResponseEntity.status(HttpStatus.CREATED).body(organizerResponseDTO);
    }

}
