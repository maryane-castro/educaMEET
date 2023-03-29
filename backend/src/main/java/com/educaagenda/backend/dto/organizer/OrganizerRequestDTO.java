package com.educaagenda.backend.dto.organizer;

import java.io.Serializable;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.educaagenda.backend.model.Organizer;

public class OrganizerRequestDTO  implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private String password;
    private String email;

    public OrganizerRequestDTO() {        
    }

    public OrganizerRequestDTO(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Organizer toOrganizer() {
        password = new BCryptPasswordEncoder(16).encode(password);
        
        Organizer organizer = new Organizer();
        organizer.setName(name);
        organizer.setEmail(email);
        organizer.setPassword(password);
        return organizer;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
    
}
