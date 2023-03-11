package com.educaagenda.backend.dto.event;

import java.time.LocalDate;

import com.educaagenda.backend.model.Event;

public class EventResponseDTO {
    private Long id;
    public Long getId() {
        return id;
    }

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String details;
    private String folder;     

    public EventResponseDTO(Event event) {
        this.id = event.getId();
        this.name = event.getName();
        this.startDate = event.getStartDate();
        this.endDate = event.getEndDate();
        this.details = event.getDetails();
        this.folder = event.getFolder();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    

        
}
