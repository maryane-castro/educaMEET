package com.educaagenda.backend.dto.organizer;

import java.io.Serializable;
import java.util.Set;

import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.model.Organizer;

public class OrganizerResponseDTO implements Serializable{
    private static final long serialVersionUID = 1L;
   
    private Long id;
    private String name;
    private String password;
    Set<Event> events;    

    public OrganizerResponseDTO() {        
    }

    public OrganizerResponseDTO(Long id, String name, String password, Set<Event> events) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.events = events;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
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

    public OrganizerResponseDTO(Organizer organizer) {
        this.id = organizer.getId();
        this.name = organizer.getName();
        this.password = organizer.getPassword();
        this.events = organizer.getEvents();
    }
    
}
