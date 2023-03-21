package com.educaagenda.backend.dto.academic;

import java.io.Serializable;
import java.util.Set;

import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.model.EventReview;

public class AcademicResponseDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String name;
    private String password; 
    private Set<Event> events;
    private Set<EventReview> reviews;

    public AcademicResponseDTO() {        
    }           

    public AcademicResponseDTO(Long id, String name, String password, Set<Event> events, Set<EventReview> reviews) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.events = events;
        this.reviews = reviews;
    }

    public AcademicResponseDTO(Academic academic) {
        id = academic.getId();
        name = academic.getName();
        password = academic.getPassword();
        events = academic.getEvents();
        reviews = academic.getReviews();
    }

    public Long getId() {
        return id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    
    public Set<Event> getEvents() {
        return events;
    }
    
    public void setEvents(Set<Event> events) {
        this.events = events;
    } 

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Set<EventReview> getReviews() {
        return reviews;
    }

    public void setReviews(Set<EventReview> reviews) {
        this.reviews = reviews;
    }
    
}
