package com.example.ativ20260505.dto;

public class CenarioResponseDTO {
    private String nome;
    private String tipo;
    private String tempo;
    private String trilhaSonora;

    public CenarioResponseDTO() {
    }

    public CenarioResponseDTO(String nome, String tipo, String tempo, String trilhaSonora) {
        this.nome = nome;
        this.tipo = tipo;
        this.tempo = tempo;
        this.trilhaSonora = trilhaSonora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getTrilhaSonora() {
        return trilhaSonora;
    }

    public void setTrilhaSonora(String trilhaSonora) {
        this.trilhaSonora = trilhaSonora;
    }
}
