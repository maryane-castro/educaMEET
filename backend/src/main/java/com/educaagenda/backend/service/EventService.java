package com.educaagenda.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.EventRequestDTO;
import com.educaagenda.backend.dto.EventResponseDTO;
import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.repository.EventRepository;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public EventResponseDTO save(EventRequestDTO eventRequestDTO) {
        Event event = eventRequestDTO.toEvent();
        return new EventResponseDTO(eventRepository.save(event));
    }

}
