package com.example.atividade20260512.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AlunoRequestDTO {

    @NotBlank(message = "Nome Obrigatório ❌")
    @Size(min = 3, message = "Nome precisa ter mais de três caracteres ❌")
    @Size(max = 20, message = "Nome precisa ter menos de 20 caracteres ❌")
    private String nome;

    @NotBlank(message = "CPF Obrigatório ❌")
    @Size(min = 3, message = "CPF precisa ter mais de três caracteres ❌")
    @Size(max = 11, message = "CPF precisa ter menos de 11 caracteres ❌")
    private String cpf;

    @NotNull(message = "Favor inserir Idade ❌")
    private int idade ;

    @NotBlank(message = "Matricula Obrigatório ❌")
    @Size(min = 3, message = "Matrícula precisa ter mais de três caracteres ❌")
    @Size(max = 8, message = "Matrícula precisa ter menos de oito caracteres ❌")
    private String matricula;

    @Email(message = "Email obrigatório ❌")
    private String email;

    public AlunoRequestDTO() {
    }

    public AlunoRequestDTO(String nome, String cpf, int idade, String matricula, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.matricula = matricula;
        this.email = email;
    }

    @NotNull(message = "Favor inserir Idade ❌")
    public int getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "Favor inserir Idade ❌") int idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "Matricula Obrigatório ❌") @Size(min = 3, message = "Nome precisa ter mais de três caracteres ❌") @Size(max = 8, message = "Nome precisa ter menos de oito caracteres ❌") String getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "Matricula Obrigatório ❌") @Size(min = 3, message = "Nome precisa ter mais de três caracteres ❌") @Size(max = 8, message = "Nome precisa ter menos de oito caracteres ❌") String matricula) {
        this.matricula = matricula;
    }

    public @Email(message = "Email obrigatório ❌") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "Email obrigatório ❌") String email) {
        this.email = email;
    }

    public @NotBlank(message = "CPF Obrigatório ❌") @Size(min = 3, message = "Nome precisa ter mais de três caracteres ❌") @Size(max = 20, message = "Nome precisa ter menos de 11 caracteres ❌") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "CPF Obrigatório ❌") @Size(min = 3, message = "Nome precisa ter mais de três caracteres ❌") @Size(max = 20, message = "Nome precisa ter menos de 11 caracteres ❌") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "Nome Obrigatório ❌") @Size(min = 3, message = "Nome precisa ter mais de três caracteres ❌") @Size(max = 20, message = "Nome precisa ter menos de 20 caracteres ❌") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome Obrigatório ❌") @Size(min = 3, message = "Nome precisa ter mais de três caracteres ❌") @Size(max = 20, message = "Nome precisa ter menos de 20 caracteres ❌") String nome) {
        this.nome = nome;
    }
}
