package com.example.ativsecurity.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ExercicioRequestDTO {

    @NotBlank(message = "Nome Obrigatório ❌")
    @Size(min = 5, message = "Nome com mais de 5 dígitos ❌")
    private String nome;

    @NotBlank(message = "Nome Obrigatório ❌")
    @Size(min = 5, message = "Nome com mais de 5 dígitos ❌")
    private String grupoMuscular;

    @NotBlank(message = "Nome Obrigatório ❌")
    @Size(max = 2, message = "2 dígitos no máximo ❌")
    private String repeticoes;

    @NotBlank(message = "Nome Obrigatório ❌")
    @Size(max = 2, message = "2 dígitos no máximo ❌")
    private String series;

    public ExercicioRequestDTO() {
    }

    public ExercicioRequestDTO(String nome, String grupoMuscular, String repeticoes, String series) {
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
        this.repeticoes = repeticoes;
        this.series = series;
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
