package com.educaagenda.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educaagenda.backend.dto.AcademicRequestDTO;
import com.educaagenda.backend.dto.AcademicResponseDTO;
import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.service.AcademicService;

@RestController
@RequestMapping("/academics")
public class AcademicController {
    
    @Autowired
    AcademicService academicService;

    @GetMapping
    public List<AcademicResponseDTO> findAll(){
        List<Academic> list = academicService.findAll();
        return list.stream().map(AcademicResponseDTO::new).toList();
    }

    @PostMapping
    public AcademicResponseDTO save(@RequestBody AcademicRequestDTO academicRequestDTO) {
        return academicService.save(academicRequestDTO);
    }
}