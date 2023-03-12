package com.educaagenda.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.academic.AcademicRequestDTO;
import com.educaagenda.backend.dto.academic.AcademicResponseDTO;
import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.repository.AcademicRepository;

import jakarta.transaction.Transactional;

@Service
public class AcademicService {

    @Autowired
    AcademicRepository academicRepository;

    public List<Academic> findAll() {
        return academicRepository.findAll();
    }

    public ResponseEntity<Object> findById(Long id) {
        Optional<Academic> academicOptional = academicRepository.findById(id);

        if (academicOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(new AcademicResponseDTO(academicOptional.get()));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Academico não encontrado.");
        }
    }

    @Transactional
    public AcademicResponseDTO save(AcademicRequestDTO academicRequestDTO) {
        Academic academic = academicRequestDTO.toAcademic();
        return new AcademicResponseDTO(academicRepository.save(academic));
    }

    @Transactional
    public ResponseEntity<Object> delete(Long id) {
        Optional<Academic> academicOptional = academicRepository.findById(id);
        if (academicOptional.isPresent()) {
            Academic academic = academicOptional.get();
            academicRepository.delete(academic);
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Academico não encontrado");
        }
    }

    @Transactional
    public ResponseEntity<Object> update(Long id, AcademicRequestDTO academicRequestDTO) {
        // Achar
        Optional<Academic> academicOptional = academicRepository.findById(id);
        if (academicOptional.isPresent()) {
            Academic academic = academicOptional.get();
            // Modificar
            if (academicRequestDTO.getName() != null) {
                academic.setName(academicRequestDTO.getName());
            }

            if (academicRequestDTO.getPassword() != null) {
                academic.setPassword(academicRequestDTO.getPassword());
            }

            // Lista de eventos

            // Salvar
            AcademicResponseDTO academicResponseDTO = new AcademicResponseDTO(academicRepository.save(academic));
            return ResponseEntity.status(HttpStatus.CREATED).body(academicResponseDTO);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Academico não encontrado");
        }
    }

}
