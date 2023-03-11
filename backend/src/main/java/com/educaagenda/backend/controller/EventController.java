package com.educaagenda.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educaagenda.backend.dto.EventRequestDTO;
import com.educaagenda.backend.dto.EventResponseDTO;
import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {
    
    @Autowired
    EventService eventService;

    
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable(name = "id") Long id) {
        return eventService.findById(id);
    }

    @GetMapping
    public List<EventResponseDTO> findAll(){
        List<Event> list = eventService.findAll();
        return list.stream().map(EventResponseDTO::new).toList();
    }

    @PostMapping
    public EventResponseDTO save(@RequestBody EventRequestDTO eventRequestDTO) {
        return eventService.save(eventRequestDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(
            @PathVariable(name = "id") Long id,
            @RequestBody EventRequestDTO eventRequestDTO){
        return eventService.update(id, eventRequestDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(
            @PathVariable(name = "id") Long id){
        return eventService.delete(id);
    }
}
