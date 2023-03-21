package com.educaagenda.backend.controller;

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

import com.educaagenda.backend.dto.event.EventRequestDTO;
import com.educaagenda.backend.dto.event.EventResponseDTO;
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
    public ResponseEntity<Object> findAll(){
        return eventService.findAll();
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

    @PostMapping("events_academics/{event_id}/{academic_id}")
    public ResponseEntity<Object> events_academics(
        @PathVariable(name = "event_id") Long event_id,
            @PathVariable(name = "academic_id") Long academic_id){

        return eventService.salvar_events_academics(event_id, academic_id);
    }

    @PostMapping("events_organizers/{event_id}/{organizer_id}")
    public ResponseEntity<Object> events_organizers(
            @PathVariable(name = "event_id") Long event_id,
            @PathVariable(name = "organizer_id") Long organizer_id) {

        return eventService.salvar_events_organizers(event_id, organizer_id);
    }
    
    //será usado???
    @PostMapping("participants_events/{event_id}/{academic_id}/{organizer_id}")
    public ResponseEntity<Object> participantes_eventos(
        @PathVariable(name = "event_id") Long event_id,
        @PathVariable(name = "academic_id") Long academic_id,
        @PathVariable(name = "organizer_id") Long organizer_id) {
            return eventService.save_participants_events(event_id, academic_id, organizer_id);
        }   
}
