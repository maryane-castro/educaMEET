package com.evento.backend.entities;

public class Participantes {
    private int idParticipante;
    private String numeroMatricula;
    private String senha;
    private String nome;

    public Participantes() {
    }

    public Participantes(int id, String numeroMatricula, String senha, String nome) {
        this.idParticipante = id;
        this.numeroMatricula = numeroMatricula;
        this.senha = senha;
        this.nome = nome;
    }

    public long getId() {
        return idParticipante;
    }

    public void setId(int id) {
        this.idParticipante = id;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    

}
