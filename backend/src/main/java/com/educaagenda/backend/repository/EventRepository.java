package com.educaagenda.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educaagenda.backend.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{
    
}
