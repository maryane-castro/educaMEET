package com.educaagenda.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.organizer.OrganizerRequestDTO;
import com.educaagenda.backend.dto.organizer.OrganizerResponseDTO;
import com.educaagenda.backend.model.Organizer;
import com.educaagenda.backend.repository.OrganizerRepository;

import jakarta.transaction.Transactional;

@Service
public class OrganizerService {

    @Autowired
    OrganizerRepository organizerRepository;

    public List<Organizer> findAll() {
        return organizerRepository.findAll();
    }

    public ResponseEntity<Object> findById(Long id) {
        Optional<Organizer> organizerOptional = organizerRepository.findById(id);

        if (organizerOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(new OrganizerResponseDTO(organizerOptional.get()));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Organizador não encontrado.");
        }
    }

    @Transactional
    public OrganizerResponseDTO save(OrganizerRequestDTO organizerRequestDTO) {
        Organizer academic = organizerRequestDTO.toOrganizer();
        return new OrganizerResponseDTO(organizerRepository.save(academic));
    }

    @Transactional
    public ResponseEntity<Object> delete(Long id) {
        Optional<Organizer> organizerOptional = organizerRepository.findById(id);
        if(organizerOptional.isPresent()){
            Organizer academic = organizerOptional.get();
            organizerRepository.delete(academic);
            return ResponseEntity.status(HttpStatus.OK).build();
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Organizador não encontrado");
        }
    }

    @Transactional
    public ResponseEntity<Object> update(Long id, OrganizerRequestDTO organizerRequestDTO) {
        //Achar
        Optional<Organizer> organizerOptional = organizerRepository.findById(id);
        if(organizerOptional.isPresent()){
            Organizer academic = organizerOptional.get();
            // Modificar
            if(organizerRequestDTO.getName()!=null){
                academic.setName(organizerRequestDTO.getName());
            }

            if(organizerRequestDTO.getPassword()!=null){
                academic.setPassword(organizerRequestDTO.getPassword());
            }

            //Lista de eventos            
            
            // Salvar
            OrganizerResponseDTO organizerResponseDTO = new OrganizerResponseDTO(organizerRepository.save(academic));
            return ResponseEntity.status(HttpStatus.CREATED).body(organizerResponseDTO);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Organizador não encontrado");
        }
    }
    
}
