package com.example.ativ20260505.dto;

import com.example.ativ20260505.model.enums.Sexo;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class JogadorRequestDTO {
    @NotBlank(message = "Nome Obrigatório ❌")
    @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌")
    @Size(max = 20, message = "Nome com no máximo 20 caracteres ❌")
    private String nome;

    @NotNull(message = "Idade Obrigatória ❌")

    private int idade;

    @NotNull(message = "Sexo precisa ser definido ❌")
    private Sexo sexo;

    @NotBlank(message = "Trilha Sonora Obrigatória ❌")
    @Email(message = "Email precisa ser válido")
    @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌")
    @Size(max = 20, message = "Nome com no máximo 12 caracteres ❌")
    private String email;

    public JogadorRequestDTO() {
    }

    public JogadorRequestDTO(String nome, int idade, Sexo sexo, String email) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
    }

    public @NotBlank(message = "Nome Obrigatório ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 20, message = "Nome com no máximo 20 caracteres ❌") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome Obrigatório ❌") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 20, message = "Nome com no máximo 20 caracteres ❌") String nome) {
        this.nome = nome;
    }

    @NotNull(message = "Idade Obrigatória ❌")

    public int getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "Idade Obrigatória ❌") int idade) {
        this.idade = idade;
    }

    public @NotNull(message = "Sexo precisa ser definido ❌") Sexo getSexo() {
        return sexo;
    }

    public void setSexo(@NotNull(message = "Sexo precisa ser definido ❌") Sexo sexo) {
        this.sexo = sexo;
    }

    public @NotBlank(message = "Trilha Sonora Obrigatória ❌") @Email(message = "Email precisa ser válido") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 20, message = "Nome com no máximo 12 caracteres ❌") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Trilha Sonora Obrigatória ❌") @Email(message = "Email precisa ser válido") @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌") @Size(max = 20, message = "Nome com no máximo 12 caracteres ❌") String email) {
        this.email = email;
    }
}
