package com.educaagenda.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educaagenda.backend.dto.academic.AcademicRequestDTO;
import com.educaagenda.backend.dto.academic.AcademicResponseDTO;
import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.service.AcademicService;

@RestController
@RequestMapping("/academics")
public class AcademicController {

    @Autowired
    AcademicService academicService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable(name = "id") Long id) {
        return academicService.findById(id);
    }

    @GetMapping
    public List<AcademicResponseDTO> findAll() {
        List<Academic> list = academicService.findAll();
        return list.stream().map(AcademicResponseDTO::new).toList();
    }

    @PostMapping
    public AcademicResponseDTO save(@RequestBody AcademicRequestDTO academicRequestDTO) {
        return academicService.save(academicRequestDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(
            @PathVariable(name = "id") Long id,
            @RequestBody AcademicRequestDTO academicRequestDTO) {
        return academicService.update(id, academicRequestDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(
            @PathVariable(name = "id") Long id) {
        return academicService.delete(id);
    }   

}