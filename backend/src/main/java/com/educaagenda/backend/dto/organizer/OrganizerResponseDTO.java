package com.educaagenda.backend.dto.organizer;

import com.educaagenda.backend.model.Organizer;

public class OrganizerResponseDTO {
   
    private Long id;
    private String name;
    private String password;

    public OrganizerResponseDTO() {        
    }

    public OrganizerResponseDTO(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public OrganizerResponseDTO(Organizer organizer) {
        this.id = organizer.getId();
        this.name = organizer.getName();
        this.password = organizer.getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
