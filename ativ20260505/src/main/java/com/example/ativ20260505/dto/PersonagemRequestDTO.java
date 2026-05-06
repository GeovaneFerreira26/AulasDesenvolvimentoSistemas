package com.example.ativ20260505.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PersonagemRequestDTO {

    @NotBlank(message = "Nome Obrigatório ❌")
    @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌")
    @Size(max = 16, message = "Nome com no máximo 16 caracteres ❌")
    private String nome;

    @NotBlank(message = "Nível do Poder Obrigatório ❌")
    @Size(max = 4, message = "Valor com no máximo 4 caracteres ❌")
    private String poder;

    @NotBlank(message = "Nível de Vida Obrigatório ❌")
    @Size(max = 4, message = "Valor com no máximo 4 caracteres ❌")
    private String life;

    @NotBlank(message = "Nível do Poder Especial Obrigatório ❌")
    @Size(max = 4, message = "Valor com no máximo 4 caracteres ❌")
    private String poderEspecial;

    public PersonagemRequestDTO() {
    }

    public PersonagemRequestDTO(String nome, String poder, String life, String poderEspecial) {
        this.nome = nome;
        this.poder = poder;
        this.life = life;
        this.poderEspecial = poderEspecial;
    }

    public @NotBlank(message = "Nome Obrigatório ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 16, message = "Nome com no máximo 16 caracteres ❌") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome Obrigatório ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 16, message = "Nome com no máximo 16 caracteres ❌") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Nível do Poder Obrigatório ❌") @Size(max = 4, message = "Valor com no máximo 4 caracteres ❌") String getPoder() {
        return poder;
    }

    public void setPoder(@NotBlank(message = "Nível do Poder Obrigatório ❌") @Size(max = 4, message = "Valor com no máximo 4 caracteres ❌") String poder) {
        this.poder = poder;
    }

    public @NotBlank(message = "Nível de Vida Obrigatório ❌") @Size(max = 4, message = "Valor com no máximo 4 caracteres ❌") String getLife() {
        return life;
    }

    public void setLife(@NotBlank(message = "Nível de Vida Obrigatório ❌") @Size(max = 4, message = "Valor com no máximo 4 caracteres ❌") String life) {
        this.life = life;
    }

    public @NotBlank(message = "Nível do Poder Especial Obrigatório ❌") @Size(max = 4, message = "Valor com no máximo 4 caracteres ❌") String getPoderEspecial() {
        return poderEspecial;
    }

    public void setPoderEspecial(@NotBlank(message = "Nível do Poder Especial Obrigatório ❌") @Size(max = 4, message = "Valor com no máximo 4 caracteres ❌") String poderEspecial) {
        this.poderEspecial = poderEspecial;
    }
}
