package com.example.ativ20260505.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_cenarios")
public class CenarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String tempo;

    @Column(nullable = false)
    private String trilhaSonora;

    public CenarioModel() {
    }

    public CenarioModel(Long id, String nome, String tipo, String tempo, String trilhaSonora) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.tempo = tempo;
        this.trilhaSonora = trilhaSonora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

