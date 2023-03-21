package com.educaagenda.backend.dto.eventReview;

import java.io.Serializable;
import java.time.LocalDate;

import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.model.EventReview;

public class EventReviewRequestDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Academic academic;
    private Event event;
    private LocalDate date;
    private String text;
    private int rate_value;    
    
    public EventReviewRequestDTO() {
    }

    public EventReviewRequestDTO(Long id, Academic academic, Event event, LocalDate date, String text, int rate_value) {
        this.id = id;
        this.academic = academic;
        this.event = event;
        this.date = date;
        this.text = text;
        this.rate_value = rate_value;
    }    

    public EventReview toEventReview() {
        EventReview eventReview = new EventReview();
        eventReview.setAcademic(academic);
        eventReview.setEvent(event);
        eventReview.setDate(date);
        eventReview.setText(text);
        eventReview.setRate_value(rate_value);      
        return eventReview;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Academic getAcademic() {
        return academic;
    }

    public void setAcademic(Academic academic) {
        this.academic = academic;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
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
