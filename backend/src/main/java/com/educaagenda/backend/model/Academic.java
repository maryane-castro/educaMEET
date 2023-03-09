package com.educaagenda.backend.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Academic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;    
    private String password;

    @ManyToMany(mappedBy = "academics")
    Set<Event> events;

    public Academic() {        
    }

    public Academic(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public long getRegistration() {
        return id;
    }

    public void setRegistration(long id) {
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

}
