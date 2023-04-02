package com.educaagenda.backend.dto.event;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import com.educaagenda.backend.model.Event;
import com.educaagenda.backend.model.EventReview;
import com.educaagenda.backend.model.Participante;

public class EventRequestDTO  implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String name;
    private String campus;
    private LocalDate startDate;
    private LocalDate endDate;
    private String details;
    private String folder;
    private double score;
    private Set<Participante> participantes;
    private Set<EventReview> reviews;

    public EventRequestDTO() {
    }

    public EventRequestDTO(Long id, String name, String campus, LocalDate startDate, LocalDate endDate, String details, String folder,
            Set<Participante> participantes, Set<EventReview> reviews, double score) {
        this.id = id;
        this.name = name;
        this.campus = campus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.details = details;
        this.folder = folder;
        this.score = score;
        this.participantes = participantes;
        this.reviews = reviews;
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
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public void setId(Long id) {
        this.id = id;
    }   
    

    public Set<EventReview> getReviews() {
        return reviews;
    }

    public void setReviews(Set<EventReview> reviews) {
        this.reviews = reviews;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Event toEvent() {
        Event event = new Event();
        event.setName(name);
        event.setCampus(campus);
        event.setStartDate(startDate);
        event.setEndDate(endDate);
        event.setDetails(details);
        event.setFolder(folder);
        event.setScore(score);    
        event.setParticipantes(participantes);
        event.setReviews(reviews);
        return event;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }


}
