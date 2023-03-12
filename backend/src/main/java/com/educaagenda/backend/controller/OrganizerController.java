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

import com.educaagenda.backend.dto.organizer.OrganizerRequestDTO;
import com.educaagenda.backend.dto.organizer.OrganizerResponseDTO;
import com.educaagenda.backend.model.Organizer;
import com.educaagenda.backend.service.OrganizerService;

@RestController
@RequestMapping("/organizers")
public class OrganizerController {

    @Autowired
    OrganizerService organizerService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable(name = "id") Long id) {
        return organizerService.findById(id);
    }

    @GetMapping
    public List<OrganizerResponseDTO> findAll() {
        List<Organizer> list = organizerService.findAll();
        return list.stream().map(OrganizerResponseDTO::new).toList();
    }

    @PostMapping
    public OrganizerResponseDTO save(@RequestBody OrganizerRequestDTO organizerRequestDTO) {
        return organizerService.save(organizerRequestDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(
            @PathVariable(name = "id") Long id,
            @RequestBody OrganizerRequestDTO organizerRequestDTO) {
        return organizerService.update(id, organizerRequestDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(
            @PathVariable(name = "id") Long id) {
        return organizerService.delete(id);
    }    
}
