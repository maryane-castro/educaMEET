package com.educaagenda.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educaagenda.backend.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/academic/{email}")
    public ResponseEntity<Object> findAcademicByEmail(
        @PathVariable(name = "email") String email) {
        return loginService.findAcademicByEmail(email);
    }

    @GetMapping("/organizer/{email}")
    public ResponseEntity<Object> findOrganizerByEmail(
        @PathVariable(name = "email") String email) {
        return loginService.findOrganizerByEmail(email);
    }
    
}
