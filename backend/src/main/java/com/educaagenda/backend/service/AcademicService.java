package com.educaagenda.backend.service;

import java.util.List;
import java.util.NoSuchElementException;

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
        
        Academic academic = academicRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Acadêmico não encontrado"));
        return ResponseEntity.status(HttpStatus.OK).body(new AcademicResponseDTO(academic));
    }

    @Transactional
    public AcademicResponseDTO save(AcademicRequestDTO academicRequestDTO) {
        Academic academic = academicRequestDTO.toAcademic();
        return new AcademicResponseDTO(academicRepository.save(academic));
    }

    @Transactional
    public ResponseEntity<Object> delete(Long id) {

        Academic academic = academicRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Acadêmico não encontrado"));
        academicRepository.delete(academic);

        return ResponseEntity.status(HttpStatus.OK).build();

    }

    @Transactional
    public ResponseEntity<Object> update(Long id, AcademicRequestDTO academicRequestDTO) {

        Academic academic = academicRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Organizador não encontrado"));

        // Modificar
        if (academicRequestDTO.getName() != null) {
            academic.setName(academicRequestDTO.getName());
        }

        if (academicRequestDTO.getPassword() != null) {
            academic.setPassword(academicRequestDTO.getPassword());
        }

        // Salvar
        AcademicResponseDTO academicResponseDTO = new AcademicResponseDTO(academicRepository.save(academic));
        return ResponseEntity.status(HttpStatus.CREATED).body(academicResponseDTO);

    }

}
