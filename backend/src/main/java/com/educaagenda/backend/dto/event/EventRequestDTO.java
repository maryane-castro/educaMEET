package com.educaagenda.backend.dto.event;

import java.time.LocalDate;
import java.util.Set;

import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.model.Organizer;

public class EventRequestDTO {
    private Long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String details;
    private String folder;
    private Set<Academic> academics;
    private Set<Organizer> organizers;

    public EventRequestDTO() {
    }

    public EventRequestDTO(Long id, String name, LocalDate startDate, LocalDate endDate, String details, String folder,
            Set<Academic> academics, Set<Organizer> organizers) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.details = details;
        this.folder = folder;
        this.academics = academics;
        this.organizers = organizers;
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

    public Long getId() {
        return id;
    }

    public Set<Academic> getAcademics() {
        return academics;
    }

    public void setAcademics(Set<Academic> academics) {
        this.academics = academics;
    }

    public Set<Organizer> getOrganizers() {
        return organizers;
    }

    public void setOrganizers(Set<Organizer> organizers) {
        this.organizers = organizers;
    }

    public Event toEvent() {
        Event event = new Event();

        event.setName(name);
        event.setStartDate(startDate);
        event.setEndDate(endDate);
        event.setDetails(details);
        event.setFolder(folder);
        event.setAcademics(academics);
        event.setOrganizers(organizers);
        return event;
    }

}
