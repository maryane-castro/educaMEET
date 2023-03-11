package com.educaagenda.backend.dto;

import com.educaagenda.backend.model.Academic;

public class AcademicResponseDTO {
    private Long id;
    private String name;
    private String password;

    public AcademicResponseDTO() {        
    }

    public AcademicResponseDTO(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public AcademicResponseDTO(Academic academic) {
        this.id = academic.getId();
        this.name = academic.getName();
        this.password = academic.getPassword();
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
