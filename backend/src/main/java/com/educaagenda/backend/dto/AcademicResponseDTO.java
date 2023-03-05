package com.educaagenda.backend.dto;

import com.educaagenda.backend.model.Academic;

public class AcademicResponseDTO {
    private String name;
    private String password;

    public AcademicResponseDTO() {        
    }

    public AcademicResponseDTO(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public AcademicResponseDTO(Academic academic) {
        this.name = academic.getName();
        this.password = academic.getPassword();
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
