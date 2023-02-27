package com.evento.backend.entities;

public class ParticipanteEvento {
    private int idParticipante;
    private int IdEvento;

    public ParticipanteEvento() {
    }

    public ParticipanteEvento(int idParticipante, int idEvento) {
        this.idParticipante = idParticipante;
        IdEvento = idEvento;
    }

    public int getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(int idParticipante) {
        this.idParticipante = idParticipante;
    }

    public int getIdEvento() {
        return IdEvento;
    }

    public void setIdEvento(int idEvento) {
        IdEvento = idEvento;
    }

    
    
}