package com.educaagenda.backend.dto.eventReview;

import java.io.Serializable;
import java.time.LocalDate;

import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.model.EventReview;

public class EventReviewResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Academic academic;
    private Event event;
    private LocalDate date;
    private String text;
    private int rate_value;

    public EventReviewResponseDTO(EventReview eventReview) {
        this.id = eventReview.getId();
        this.academic = eventReview.getAcademic();
        this.event = eventReview.getEvent();
        this.date = eventReview.getDate();
        this.text = eventReview.getText();
        this.rate_value = eventReview.getRate_value();
    }

    public EventReviewResponseDTO() {
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
