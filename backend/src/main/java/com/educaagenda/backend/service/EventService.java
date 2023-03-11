package com.educaagenda.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.EventRequestDTO;
import com.educaagenda.backend.dto.EventResponseDTO;
import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.repository.EventRepository;

import jakarta.transaction.Transactional;



@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public ResponseEntity<Object> findById(Long id) {
        Optional<Event> eventOptional = eventRepository.findById(id);

        if (eventOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(new EventResponseDTO(eventOptional.get()));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento não encontrado.");
        }
    }

    @Transactional
    public EventResponseDTO save(EventRequestDTO eventRequestDTO) {
        Event event = eventRequestDTO.toEvent();
        return new EventResponseDTO(eventRepository.save(event));
    }

    @Transactional
    public ResponseEntity<Object> delete(Long id) {
        Optional<Event> eventOptional = eventRepository.findById(id);
        if(eventOptional.isPresent()){
            Event event = eventOptional.get();
            eventRepository.delete(event);
            return ResponseEntity.status(HttpStatus.OK).build();
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento não encontrado");
        }
    }

    @Transactional
    public ResponseEntity<Object> update(Long id, EventRequestDTO eventRequestDTO) {
        //Achar
        Optional<Event> eventOptional = eventRepository.findById(id);
        if(eventOptional.isPresent()){
            Event event = eventOptional.get();
            // Modificar
            if(eventRequestDTO.getName()!=null){
                event.setName(eventRequestDTO.getName());
            }

            if (eventRequestDTO.getStartDate()!=null) {
                event.setStartDate(eventRequestDTO.getStartDate());
            }

            if (eventRequestDTO.getEndDate()!=null) {
                event.setEndDate(eventRequestDTO.getEndDate());
            }

            if(eventRequestDTO.getDetails()!=null){
                event.setDetails(eventRequestDTO.getDetails());
            }

            if(eventRequestDTO.getFolder()!=null){
                event.setFolder(eventRequestDTO.getFolder());
            }

            //Lista de academicos
            //lista de organizadores
            
            // Salvar
            EventResponseDTO eventResponseDTO = new EventResponseDTO(eventRepository.save(event));
            return ResponseEntity.status(HttpStatus.CREATED).body(eventResponseDTO);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento não encontrado");
        }
    }

}
