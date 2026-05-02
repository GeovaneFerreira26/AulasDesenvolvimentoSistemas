package com.example.ativsecurity.dto;


public class ExercicioResponseDTO {
    private Long id;
    private String nome;
    private String grupoMuscular;
    private String repeticoes;
    private String series;

    public ExercicioResponseDTO() {
    }

    public ExercicioResponseDTO(Long id, String nome, String grupoMuscular, String repeticoes, String series) {
        this.id = id;
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
        this.repeticoes = repeticoes;
        this.series = series;
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

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public String getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(String repeticoes) {
        this.repeticoes = repeticoes;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
