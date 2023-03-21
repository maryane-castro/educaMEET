package com.educaagenda.backend.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.event.EventRequestDTO;
import com.educaagenda.backend.dto.event.EventResponseDTO;
import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.model.Organizer;
import com.educaagenda.backend.repository.AcademicRepository;
import com.educaagenda.backend.repository.EventRepository;
import com.educaagenda.backend.repository.OrganizerRepository;

import jakarta.transaction.Transactional;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    AcademicRepository academicRepository;

    @Autowired
    OrganizerRepository organizerRepository;

    public ResponseEntity<Object> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(
                eventRepository.findAll().stream().map((event) -> new EventResponseDTO(event)).toList());
    }

    public ResponseEntity<Object> findById(Long id) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Evento não encontrado"));
        return ResponseEntity.status(HttpStatus.OK).body(new EventResponseDTO(event));
    }

    @Transactional
    public EventResponseDTO save(EventRequestDTO eventRequestDTO) {
        Event event = eventRequestDTO.toEvent();
        return new EventResponseDTO(eventRepository.save(event));
    }

    @Transactional
    public ResponseEntity<Object> delete(Long id) {

        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Evento não Encontrado"));
        eventRepository.delete(event);
        
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Transactional
    public ResponseEntity<Object> update(Long id, EventRequestDTO eventRequestDTO) {

        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Evento não encontrado"));

        // Modificar
        if (eventRequestDTO.getName() != null) {
            event.setName(eventRequestDTO.getName());
        }

        if (eventRequestDTO.getStartDate() != null) {
            event.setStartDate(eventRequestDTO.getStartDate());
        }

        if (eventRequestDTO.getEndDate() != null) {
            event.setEndDate(eventRequestDTO.getEndDate());
        }

        if (eventRequestDTO.getDetails() != null) {
            event.setDetails(eventRequestDTO.getDetails());
        }

        if (eventRequestDTO.getFolder() != null) {
            event.setFolder(eventRequestDTO.getFolder());
        }

        // Salvar
        return ResponseEntity.status(HttpStatus.OK).body(new EventResponseDTO(eventRepository.save(event)));

    }

    public ResponseEntity<Object> salvar_events_academics(Long event_id, Long academic_id) {

        Optional<Event> eventOptional = eventRepository.findById(event_id);
        if (eventOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento não encontrado");
        }

        Optional<Academic> academicOptional = academicRepository.findById(academic_id);
        if (academicOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Academico não encontrado");
        }

        Event event = eventOptional.get();
        Academic academic = academicOptional.get();

        if (academic.getEvents().contains(event)) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Academico já cadastrado no Evento");
        }

        event.getAcademics().add(academic);

        return ResponseEntity.status(HttpStatus.CREATED).body(new EventResponseDTO(eventRepository.save(event)));
    }

    @Transactional
    public ResponseEntity<Object> salvar_events_organizers(Long event_id, Long organizer_id) {

        Optional<Event> eventOptional = eventRepository.findById(event_id);
        if (eventOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento não encontrado");
        }

        Optional<Organizer> organizerOptional = organizerRepository.findById(organizer_id);
        if (organizerOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Organizador não encontrado");
        }

        Event event = eventOptional.get();
        Organizer organizer = organizerOptional.get();

        if (organizer.getEvents().contains(event)) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Organizador já cadastrado no Evento");
        }

        event.getOrganizers().add(organizer);

        return ResponseEntity.status(HttpStatus.CREATED).body(new EventResponseDTO(eventRepository.save(event)));
    }

    //será usado???
    public ResponseEntity<Object> save_participants_events(Long event_id, Long academic_id, Long organizer_id) {

        Optional<Event> eventOptional = eventRepository.findById(event_id);
        if (eventOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento não encontrado");
        }

        Optional<Academic> academicOptional = academicRepository.findById(academic_id);
        if (academicOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Academico não encontrado");
        }

        Optional<Organizer> organizerOptional = organizerRepository.findById(organizer_id);
        if (organizerOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Organizador não encontrado");
        }

        Event event = eventOptional.get();
        Academic academic = academicOptional.get();
        if (academic.getEvents().contains(event)) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Academico já cadastrado no Evento");
        }

        Organizer organizer = organizerOptional.get();
        if (organizer.getEvents().contains(event)) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Organizador já cadastrado no Evento");
        }

        event.getAcademics().add(academic);
        event.getOrganizers().add(organizer);

        return ResponseEntity.status(HttpStatus.CREATED).body(new EventResponseDTO(eventRepository.save(event)));
    }   

}