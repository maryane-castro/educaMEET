package com.educaagenda.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.academic.AcademicResponseDTO;
import com.educaagenda.backend.dto.organizer.OrganizerResponseDTO;
import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.model.Organizer;
import com.educaagenda.backend.repository.AcademicRepository;
import com.educaagenda.backend.repository.OrganizerRepository;

@Service
public class LoginService {

    @Autowired
    AcademicRepository academicRepository;

    @Autowired
    OrganizerRepository organizerRepository;

    public ResponseEntity<Object> findAcademicByEmail(String email) {
        
        Academic academic = academicRepository.findByEmail(email);        

        if (academic == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Acadêmico(a) não localizado(a) no servidor!");
        }
        
        return ResponseEntity.status(HttpStatus.OK).body(new AcademicResponseDTO(academic));            

    }

    public ResponseEntity<Object> findOrganizerByEmail(String email) {
        
        Organizer organizer = organizerRepository.findByEmail(email);        

        if (organizer == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Organizador(a) não localizado(a) no servidor!");
        }
        
        return ResponseEntity.status(HttpStatus.OK).body(new OrganizerResponseDTO(organizer));            

    }
    
}
