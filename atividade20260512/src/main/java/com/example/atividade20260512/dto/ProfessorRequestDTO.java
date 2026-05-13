package com.example.atividade20260512.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProfessorRequestDTO {

    @NotBlank(message = "Nome Obrigatório ❌")
    @Size(min = 4, message = "Nome com no mínimo 4 caracteres ❌")
    @Size(max = 20, message = "Nome com no máximo 20 caracteres ❌")
    private String nome;

    @NotBlank(message = "Matricula Obrigatória ❌")
    @Size(min = 4, message = "Matricula com no mínimo 4 caracteres ❌")
    @Size(max = 6, message = "Matricula com no máximo 6 caracteres ❌")
    private String matricula;

    @NotBlank(message = "Materia Obrigatória ❌")
    @Size(min = 4, message = "Materia com no mínimo 4 caracteres ❌")
    @Size(max = 16, message = "Materia com no máximo 16 caracteres ❌")
    private String materia;

    @Email(message = "Email precisa ser válido ❌")
    private String email;

    @NotBlank(message = "Telefone Obrigatório ❌")
    @Size(min = 4, message = "Telefone com no mínimo 4 caracteres ❌")
    @Size(max = 11, message = "Telefone com no máximo 11 caracteres ❌")
    private String contato;

    public ProfessorRequestDTO() {
    }

    public ProfessorRequestDTO(String nome, String matricula, String materia, String email, String contato) {
        this.nome = nome;
        this.matricula = matricula;
        this.materia = materia;
        this.email = email;
        this.contato = contato;
    }

    public @NotBlank(message = "Nome Obrigatório ❌") @Size(min = 4, message = "Nome com no mínimo 4 caracteres ❌") @Size(max = 20, message = "Nome com no máximo 20 caracteres ❌") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome Obrigatório ❌") @Size(min = 4, message = "Nome com no mínimo 4 caracteres ❌") @Size(max = 20, message = "Nome com no máximo 20 caracteres ❌") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Matricula Obrigatória ❌") @Size(min = 4, message = "Matricula com no mínimo 4 caracteres ❌") @Size(max = 6, message = "Matricula com no máximo 6 caracteres ❌") String getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "Matricula Obrigatória ❌") @Size(min = 4, message = "Matricula com no mínimo 4 caracteres ❌") @Size(max = 6, message = "Matricula com no máximo 6 caracteres ❌") String matricula) {
        this.matricula = matricula;
    }

    public @NotBlank(message = "Materia Obrigatória ❌") @Size(min = 4, message = "Materia com no mínimo 4 caracteres ❌") @Size(max = 16, message = "Materia com no máximo 16 caracteres ❌") String getMateria() {
        return materia;
    }

    public void setMateria(@NotBlank(message = "Materia Obrigatória ❌") @Size(min = 4, message = "Materia com no mínimo 4 caracteres ❌") @Size(max = 16, message = "Materia com no máximo 16 caracteres ❌") String materia) {
        this.materia = materia;
    }

    public @Email(message = "Email precisa ser válido ❌") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "Email precisa ser válido ❌") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Telefone Obrigatório ❌") @Size(min = 4, message = "Telefone com no mínimo 4 caracteres ❌") @Size(max = 11, message = "Telefone com no máximo 11 caracteres ❌") String getContato() {
        return contato;
    }

    public void setContato(@NotBlank(message = "Telefone Obrigatório ❌") @Size(min = 4, message = "Telefone com no mínimo 4 caracteres ❌") @Size(max = 11, message = "Telefone com no máximo 11 caracteres ❌") String contato) {
        this.contato = contato;
    }
}
