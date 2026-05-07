package com.example.ativ20260505.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CenarioRequestDTO {

    @NotBlank(message = "Nome Obrigatório ❌")
    @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌")
    @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌")
    private String nome;

    @NotBlank(message = "Tipo de Cenário Obrigatório ❌")
    @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌")
    @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌")
    private String tipo;

    @NotBlank(message = "Tipo de Tempo Obrigatório ❌")
    @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌")
    @Size(max= 12, message = "Nome com no máximo 12 caracteres ❌")
    private String tempo;

    @NotBlank(message = "Trilha Sonora Obrigatória ❌")
    @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌")
    @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌")
    private String trilhaSonora;

    public CenarioRequestDTO() {
    }

    public CenarioRequestDTO(String nome, String tipo, String tempo, String trilhaSonora) {
        this.nome = nome;
        this.tipo = tipo;
        this.tempo = tempo;
        this.trilhaSonora = trilhaSonora;
    }

    public @NotBlank(message = "Nome Obrigatório ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome Obrigatório ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Tipo de Cenário Obrigatório ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌") String getTipo() {
        return tipo;
    }

    public void setTipo(@NotBlank(message = "Tipo de Cenário Obrigatório ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌") String tipo) {
        this.tipo = tipo;
    }

    public @NotBlank(message = "Tipo de Tempo Obrigatório ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌") String getTempo() {
        return tempo;
    }

    public void setTempo(@NotBlank(message = "Tipo de Tempo Obrigatório ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌") String tempo) {
        this.tempo = tempo;
    }

    public @NotBlank(message = "Trilha Sonora Obrigatória ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌") String getTrilhaSonora() {
        return trilhaSonora;
    }

    public void setTrilhaSonora(@NotBlank(message = "Trilha Sonora Obrigatória ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 12, message = "Nome com no máximo 12 caracteres ❌") String trilhaSonora) {
        this.trilhaSonora = trilhaSonora;
    }
}
