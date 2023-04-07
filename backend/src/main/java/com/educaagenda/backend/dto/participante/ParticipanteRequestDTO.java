package com.educaagenda.backend.dto.participante;

import java.io.Serializable;
import java.util.Set;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.model.EventReview;
import com.educaagenda.backend.model.Participante;

public class ParticipanteRequestDTO implements Serializable{
    private String name;
    private String tipo;
    private String email;    
    private String password;
    private Set<Event> events;
    private Set<EventReview> eventReviews;

    public ParticipanteRequestDTO() {}
 
    public Participante toParticipante() {
        
        password = new BCryptPasswordEncoder().encode(password);

        Participante participante = new Participante();
        participante.setName(name);
        participante.setTipo(tipo);
        participante.setEmail(email);
        participante.setPassword(password);
        participante.setEvents(events);
        participante.setReviews(eventReviews);
        return participante;
    }

    public ParticipanteRequestDTO(String name, String tipo, String email, String password) {
        this.name = name;
        this.tipo = tipo;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Set<EventReview> getEventReviews() {
        return eventReviews;
    }

    public void setEventReviews(Set<EventReview> eventReviews) {
        this.eventReviews = eventReviews;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    
    
}
