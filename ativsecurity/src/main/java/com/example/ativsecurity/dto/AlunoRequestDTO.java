package com.example.ativsecurity.dto;

import jakarta.validation.constraints.*;

public class AlunoRequestDTO {

    @NotBlank(message = "Nome Obrigatório ❌")
    @Size(min = 3, message = "Nome com no mínimo 3 caracteres ❌")
    @Size(max = 20, message = "Nome com no máximo 20 Caracteres ❌")
    private String nome;

    @NotBlank(message = "Email Obrigatório")
    @Email(message = "Email precisa ser válido")
    private String email;

    @NotNull(message = "Idade obrigatório")

    private Integer idade;

    @NotBlank(message = "Senha obrigatória")
    @Size(message = "Senha precisa ter 8 dígitos")
    private String senha;

    public AlunoRequestDTO() {
    }

    public AlunoRequestDTO(String nome, String email, Integer idade, String senha) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
