package com.educaagenda.backend.dto.academic;

import java.io.Serializable;
import java.util.Set;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.model.EventReview;

public class AcademicRequestDTO  implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private String email;    
    private String password;
    private Set<Event> events;
    private Set<EventReview> eventReviews;

    public AcademicRequestDTO() {        
    }

    public AcademicRequestDTO(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Academic toAcademic() {
        password = new BCryptPasswordEncoder().encode(password);

        Academic academic = new Academic();
        academic.setName(name);
        academic.setEmail(email);
        academic.setPassword(password);
        academic.setEvents(events);
        academic.setReviews(eventReviews);
        return academic;
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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Set<EventReview> getEventReviews() {
        return eventReviews;
    }

    public void setEventReviews(Set<EventReview> eventReviews) {
        this.eventReviews = eventReviews;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 
    
       
}
