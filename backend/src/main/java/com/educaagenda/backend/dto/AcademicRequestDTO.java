package com.educaagenda.backend.dto;

import com.educaagenda.backend.model.Academic;

public class AcademicRequestDTO {

    private String name;
    private String password;

    public AcademicRequestDTO() {        
    }

    public AcademicRequestDTO(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Academic toAcademic() {
        Academic academic = new Academic();
        academic.setName(name);
        academic.setPassword(password);
        return academic;
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
