package com.educaagenda.backend.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EventReview implements  Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "event_id")
    Event event;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "academic_id")
    Academic academic;

    private LocalDate date;
    private String text;
    private int rate_value;
    
    public EventReview() {    }

    public EventReview(Long id, Event event, Academic academic, LocalDate date, String text, int rate_value) {
        this.id = id;
        this.event = event;
        this.academic = academic;
        this.date = date;
        this.text = text;
        this.rate_value = rate_value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Academic getAcademic() {
        return academic;
    }

    public void setAcademic(Academic academic) {
        this.academic = academic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRate_value() {
        return rate_value;
    }

    public void setRate_value(int rate_value) {
        this.rate_value = rate_value;
    }

    

}
