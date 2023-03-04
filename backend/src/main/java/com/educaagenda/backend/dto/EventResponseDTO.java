package com.educaagenda.backend.dto;

import java.time.LocalDate;

import com.educaagenda.backend.model.Event;

public class EventResponseDTO {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String details;
    private String folder; 

    public EventResponseDTO(String name, LocalDate startDate, LocalDate endDate, String details, String folder) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.details = details;
        this.folder = folder;
    }

    public EventResponseDTO(Event event) {
        this.name = event.getName();
        this.startDate = event.getStartDate();
        this.endDate = event.getEndDate();
        this.details = event.getDetails();
        this.folder = event.getFolder();
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
