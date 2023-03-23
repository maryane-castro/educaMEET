package com.educaagenda.backend.dto.eventReview;

import java.io.Serializable;
import java.time.LocalDate;

import com.educaagenda.backend.model.EventReview;

public class EventReviewRequestDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Long academicId;
    private Long eventId;
    private LocalDate date;
    private String text;
    private double rate_value;    
    
    public EventReviewRequestDTO() {
    }
  
    public EventReviewRequestDTO(Long id, Long academicId, Long eventId, LocalDate date, String text, double rate_value) {
        this.id = id;
        this.academicId = academicId;
        this.eventId = eventId;
        this.date = date;
        this.text = text;
        this.rate_value = rate_value;
    }    

    public EventReview toEventReview() {
        EventReview eventReview = new EventReview();
        //eventReview.setAcademic(null);
        //eventReview.setEvent(null);
        eventReview.setDate(date);
        eventReview.setText(text);
        eventReview.setRate_value(rate_value);      
        return eventReview;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAcademicId() {
        return academicId;
    }

    public void setAcademicId(Long academicId) {
        this.academicId = academicId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
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

    public double getRate_value() {
        return rate_value;
    }

    public void setRate_value(double rate_value) {
        this.rate_value = rate_value;
    }

    
}
