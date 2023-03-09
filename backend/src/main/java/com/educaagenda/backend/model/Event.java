package com.educaagenda.backend.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String details;
    private String folder;

    @ManyToMany
    @JoinTable(
        name = "events_academics", 
        joinColumns = @JoinColumn(name = "academic_id"),
        inverseJoinColumns = @JoinColumn(name = "event_id"))
    Set<Academic> academics;
    
    public Event() {
    }
    
    public Event(String name, LocalDate startDate, LocalDate endDate, String details, String folder) {
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

    
}
