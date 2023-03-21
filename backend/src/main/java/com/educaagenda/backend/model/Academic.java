package com.educaagenda.backend.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Academic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;    
    private String password;    

    @JsonIgnore
    @ManyToMany(
        targetEntity = Event.class, cascade = CascadeType.ALL,
        mappedBy = "academics")
    Set<Event> events;

    @OneToMany(mappedBy = "academic")
    Set<EventReview> reviews;

    public Academic() {        
    }
    
    public Academic(long id, String name, String password, Set<Event> events, Set<EventReview> reviews) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.events = events;
        this.reviews = reviews;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Set<EventReview> getReviews() {
        return reviews;
    }

    public void setReviews(Set<EventReview> reviews) {
        this.reviews = reviews;
    }      
    

}
