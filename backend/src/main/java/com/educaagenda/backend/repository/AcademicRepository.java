package com.educaagenda.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educaagenda.backend.model.Academic;

@Repository
public interface AcademicRepository extends JpaRepository<Academic, Long>{   
}
