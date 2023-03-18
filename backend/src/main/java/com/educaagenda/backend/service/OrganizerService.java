package com.educaagenda.backend.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.organizer.OrganizerRequestDTO;
import com.educaagenda.backend.dto.organizer.OrganizerResponseDTO;
import com.educaagenda.backend.model.Organizer;
import com.educaagenda.backend.repository.EventRepository;
import com.educaagenda.backend.repository.OrganizerRepository;

import jakarta.transaction.Transactional;

@Service
public class OrganizerService {

    @Autowired
    OrganizerRepository organizerRepository;

    @Autowired
    EventRepository eventRepository;

    public List<Organizer> findAll() {
        return organizerRepository.findAll();
    }

    public ResponseEntity<Object> findById(Long id) {
        Organizer organizer = organizerRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Organizador não encontrado"));
        return ResponseEntity.status(HttpStatus.OK).body(new OrganizerResponseDTO(organizer));
    }

    @Transactional
    public OrganizerResponseDTO save(OrganizerRequestDTO organizerRequestDTO) {
        Organizer academic = organizerRequestDTO.toOrganizer();
        return new OrganizerResponseDTO(organizerRepository.save(academic));
    }

    @Transactional
    public ResponseEntity<Object> delete(Long id) {
        Organizer organizer = organizerRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Organizador não encontrado"));
        organizerRepository.delete(organizer);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Transactional
    public ResponseEntity<Object> update(Long id, OrganizerRequestDTO organizerRequestDTO) {
        Organizer organizer = organizerRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Organizador não encontrado"));

        // Modificar
        if (organizerRequestDTO.getName() != null) {
            organizer.setName(organizerRequestDTO.getName());
        }

        if (organizerRequestDTO.getPassword() != null) {
            organizer.setPassword(organizerRequestDTO.getPassword());
        }

        OrganizerResponseDTO organizerResponseDTO = new OrganizerResponseDTO(organizerRepository.save(organizer));
        return ResponseEntity.status(HttpStatus.CREATED).body(organizerResponseDTO);
    }

}
