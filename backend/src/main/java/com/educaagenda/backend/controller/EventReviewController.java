package com.educaagenda.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educaagenda.backend.dto.eventReview.EventReviewRequestDTO;
import com.educaagenda.backend.dto.eventReview.EventReviewResponseDTO;
import com.educaagenda.backend.service.EventReviewService;

@RestController
@RequestMapping("/reviews")
public class EventReviewController {

    @Autowired
    EventReviewService eventReviewService;

    @GetMapping("/{event_id}")
    public ResponseEntity<Object> findById(@PathVariable(name = "event_id") Long id) {
        return eventReviewService.findByEvent_id(id);
    }

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return eventReviewService.findAll();
    }     

    @PostMapping
    public EventReviewResponseDTO saveReview(@RequestBody EventReviewRequestDTO eventReviewRequestDTO) {
        return eventReviewService.saveReview(eventReviewRequestDTO);
    }
    


}
