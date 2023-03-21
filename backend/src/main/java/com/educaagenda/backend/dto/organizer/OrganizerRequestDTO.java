package com.educaagenda.backend.dto.organizer;

import java.io.Serializable;

import com.educaagenda.backend.model.Organizer;

public class OrganizerRequestDTO  implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private String password;

    public OrganizerRequestDTO() {        
    }

    public OrganizerRequestDTO(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Organizer toOrganizer() {
        Organizer organizer = new Organizer();
        organizer.setName(name);
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
}
