package com.educaagenda.backend.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.eventReview.EventReviewRequestDTO;
import com.educaagenda.backend.dto.eventReview.EventReviewResponseDTO;
import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.model.EventReview;
import com.educaagenda.backend.repository.AcademicRepository;
import com.educaagenda.backend.repository.EventRepository;
import com.educaagenda.backend.repository.EventReviewRepository;

import jakarta.transaction.Transactional;

@Service
public class EventReviewService {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    AcademicRepository academicRepository;

    @Autowired
    EventReviewRepository eventReviewRepository;

    public ResponseEntity<Object> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(
                eventReviewRepository.findAll().stream().map((eventReview) -> new EventReviewResponseDTO(eventReview))
                        .toList());
    }

    // procura por Eventos que já receberam Avaliações
    public ResponseEntity<Object> findByEvent_id(Long event_id) {

        Optional<Event> eventOptional = eventRepository.findById(event_id);
        if (eventOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento não encontrado");
        }

        Event event = eventOptional.get();
        var resposta = eventReviewRepository.findByEvent(event).stream()
                .map((retorno) -> new EventReviewResponseDTO(retorno)).toList();

        if (resposta.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Este Evento ainda não recebeu nenhuma avaliação");
        }

        return ResponseEntity.status(HttpStatus.OK).body(resposta);
    }

    @Transactional
    public EventReviewResponseDTO saveReview(EventReviewRequestDTO eventReviewRequestDTO) {
        EventReview eventReview = eventReviewRequestDTO.toEventReview();

        // localizar academico pelo eventReviewRequestDTO
        Academic academic = academicRepository.findById(eventReviewRequestDTO.getAcademicId())
                .orElseThrow(() -> new NoSuchElementException("Acadêmico não encontrado"));

        // localizar evento pelo eventReviewRequestDTO
        Event event = eventRepository.findById(eventReviewRequestDTO.getEventId())
                .orElseThrow(() -> new NoSuchElementException("Evento não encontrado"));

        eventReview.setAcademic(academic);
        eventReview.setEvent(event);
        
        return new EventReviewResponseDTO(eventReviewRepository.save(eventReview));
    }
}
