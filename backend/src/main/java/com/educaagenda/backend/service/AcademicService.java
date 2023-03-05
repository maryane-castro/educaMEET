package com.educaagenda.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.AcademicRequestDTO;
import com.educaagenda.backend.dto.AcademicResponseDTO;
import com.educaagenda.backend.model.Academic;
import com.educaagenda.backend.repository.AcademicRepository;

@Service
public class AcademicService {

    @Autowired
    AcademicRepository academicRepository;

    public List<Academic> findAll() {
        return academicRepository.findAll();
    }

    public AcademicResponseDTO save(AcademicRequestDTO academicRequestDTO) {

        Academic academic = academicRequestDTO.toAcademic();
        return new AcademicResponseDTO(academicRepository.save(academic));
    }
}
