package com.evento.backend.entities;

import java.time.LocalDate;

public class Evento {
    private int idEvento;
    private String nomeEvento;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private String localEvento;
    private String organizadores;
    private String detalhes;
    private String folder;

    public Evento() {        
    }    

    public Evento(int id, String nomeEvento, LocalDate dataInicio, LocalDate dataTermino, String localEvento,
            String organizadores, String detalhes, String folder) {
        this.idEvento = id;
        this.nomeEvento = nomeEvento;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.localEvento = localEvento;
        this.organizadores = organizadores;
        this.detalhes = detalhes;
        this.folder = folder;
    }



    public long getId() {
        return idEvento;
    }

    public void setId(int id) {
        this.idEvento = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public String getOrganizadores() {
        return organizadores;
    }

    public void setOrganizadores(String organizadores) {
        this.organizadores = organizadores;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    

}
