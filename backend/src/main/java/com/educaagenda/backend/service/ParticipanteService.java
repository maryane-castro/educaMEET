package com.educaagenda.backend.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.participante.ParticipanteRequestDTO;
import com.educaagenda.backend.dto.participante.ParticipanteResponseDTO;
import com.educaagenda.backend.exception.exceptions.ConflictStoreException;
import com.educaagenda.backend.exception.exceptions.EmailValidatorException;
import com.educaagenda.backend.model.Participante;
import com.educaagenda.backend.repository.ParticipanteRepository;

import jakarta.transaction.Transactional;

@Service
public class ParticipanteService {

    @Autowired
    ParticipanteRepository participanteRepository;

    public List<Participante> findAll() {
        return participanteRepository.findAll();
    }

    public ResponseEntity<Object> findById(Long id) {

        Participante participante = participanteRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Participante não encontrado"));
        return ResponseEntity.status(HttpStatus.OK).body(new ParticipanteResponseDTO(participante));
    }

    @Transactional
    public ParticipanteResponseDTO save(ParticipanteRequestDTO participanteRequestDTO) {

        Participante participante = participanteRequestDTO.toParticipante();

        if (participante.getEmail() != null) {

            var validation = EmailValidatorService.patternMatches(
                    participanteRequestDTO.getEmail(),
                    "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
            if (!validation) {
                throw new EmailValidatorException("Formato do e-mail inválido");
            }

            if (participanteRepository.existsByEmail(participante.getEmail())) {
                throw new ConflictStoreException("Este e-mail já está sendo usado!");
            }
        }

        participante.setEmail(participanteRequestDTO.getEmail());

        return new ParticipanteResponseDTO(participanteRepository.save(participante));
    }

    @Transactional
    public ResponseEntity<Object> delete(Long id) {

        Participante participante = participanteRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Participante não encontrado"));

        // if (participante.getEvents().size() > 0) {
        // return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
        // "Não é possível excluir " + participante.getName() + " pois ele(a) está
        // cadastrado(a) em algum Evento");
        // }

        participanteRepository.delete(participante);

        return ResponseEntity.status(HttpStatus.OK).build();

    }

    @Transactional
    public ResponseEntity<Object> update(Long id, ParticipanteRequestDTO participanteRequestDTO) {

        Participante participante = participanteRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Participante não encontrado"));

        // Modificar
        if (participanteRequestDTO.getName() != null) {
            participante.setName(participanteRequestDTO.getName());
        }

        if (participanteRequestDTO.getEmail() != null) {

            var validation = EmailValidatorService.patternMatches(
                    participanteRequestDTO.getEmail(),
                    "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

            if (!validation) {
                throw new EmailValidatorException("Formato do e-mail inválido");
            }

            if ((participanteRepository.existsByEmail(participanteRequestDTO.getEmail())) &&
                    (!participante.getEmail().equals(participanteRequestDTO.getEmail()))) {
                throw new ConflictStoreException("Este e-mail já está sendo usado!");
            }

            participante.setEmail(participanteRequestDTO.getEmail());
        }

        if (participanteRequestDTO.getTipo() != null) {
            participante.setTipo(participanteRequestDTO.getTipo());
        }

        if (participanteRequestDTO.getPassword() != null) {
            participante.setPassword(new BCryptPasswordEncoder().encode(participanteRequestDTO.getPassword()));
        }

        // if ((participanteRequestDTO.getPassword() != null) ||
        // (!participanteRequestDTO.getPassword().equals(participante.getPassword()))) {
        // participante.setPassword(new
        // BCryptPasswordEncoder().encode(participanteRequestDTO.getPassword()));
        // }

        // Salvar
        ParticipanteResponseDTO participanteResponseDTO = new ParticipanteResponseDTO(
                participanteRepository.save(participante));
        return ResponseEntity.status(HttpStatus.CREATED).body(participanteResponseDTO);

    }
}
