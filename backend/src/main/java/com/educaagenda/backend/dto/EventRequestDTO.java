package com.educaagenda.backend.dto;

import java.time.LocalDate;

import com.educaagenda.backend.model.Event;

public class EventRequestDTO {
    private Long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String details;
    private String folder;

    public EventRequestDTO() {        
    }

    public EventRequestDTO(Long id, String name, LocalDate startDate, LocalDate endDate, String details,
            String folder) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.details = details;
        this.folder = folder;
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

    public Event toEvent() {
        Event event = new Event();
        
        event.setName(name);
        event.setStartDate(startDate);
        event.setEndDate(endDate);
        event.setDetails(details);
        event.setFolder(folder);
        return event;
    }

    public Long getId() {
        return id;
    }
    
}
