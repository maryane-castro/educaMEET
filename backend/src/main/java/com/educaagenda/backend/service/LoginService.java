package com.educaagenda.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.academic.AcademicRequestDTO;
import com.educaagenda.backend.dto.academic.AcademicResponseDTO;
import com.educaagenda.backend.dto.organizer.OrganizerRequestDTO;
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

    public ResponseEntity<Object> academicLogin(String email, AcademicRequestDTO academicRequestDTO) {
        
        Academic academic = academicRepository.findByEmail(email);        
        if (academic == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Acadêmico(a) não localizado(a) no servidor!");
        }

        //vem do banco - vem hash
        var encodedPassword  = academic.getPassword(); 
        var rawPassword = academicRequestDTO.getPassword();     

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();        
        if (passwordEncoder.matches(rawPassword, encodedPassword)) {
            return ResponseEntity.status(HttpStatus.OK).body(new AcademicResponseDTO(academic));                 
        }        
        else{

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Password inválida para o Acadêmico " + academic.getEmail());
        }  
        

    }

    public ResponseEntity<Object> organizerLogin(String email, OrganizerRequestDTO organizerRequestDTO) {
        
        Organizer organizer = organizerRepository.findByEmail(email);        
        if (organizer == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Organizador(a) não localizado(a) no servidor!");
        }

        //vem do banco - vem hash
        var encodedPassword = organizer.getPassword(); 
        var rawPassword = organizerRequestDTO.getPassword();     

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();        
        if (passwordEncoder.matches(rawPassword, encodedPassword)) {
            return ResponseEntity.status(HttpStatus.OK).body(new OrganizerResponseDTO(organizer));                 
        }        
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Password inválida para o Organizador " + organizer.getEmail());
        }    
    }
    
}
