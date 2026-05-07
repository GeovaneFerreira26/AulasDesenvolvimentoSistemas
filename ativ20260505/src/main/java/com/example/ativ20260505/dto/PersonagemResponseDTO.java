package com.example.ativ20260505.dto;

public class PersonagemResponseDTO {
    private String nome;
    private String poder;
    private String life;
    private String poderEspecial;

    public PersonagemResponseDTO() {
    }

    public PersonagemResponseDTO(String nome, String poder, String life, String poderEspecial) {
        this.nome = nome;
        this.poder = poder;
        this.life = life;
        this.poderEspecial = poderEspecial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    public String getPoderEspecial() {
        return poderEspecial;
    }

    public void setPoderEspecial(String poderEspecial) {
        this.poderEspecial = poderEspecial;
    }
}
