package com.educaagenda.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Academic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long registration;
    private String name;    
    private String password;

    public Academic() {        
    }

    public Academic(long registration, String name, String password) {
        this.registration = registration;
        this.name = name;
        this.password = password;
    }

    public long getRegistration() {
        return registration;
    }

    public void setRegistration(long registration) {
        this.registration = registration;
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
