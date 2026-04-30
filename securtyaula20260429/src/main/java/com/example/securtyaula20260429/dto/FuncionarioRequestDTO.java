package com.example.securtyaula20260429.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class FuncionarioRequestDTO {
    @NotBlank(message = "O nome é Obrigatório ❌")
    @Size(min = 2, message = "O nome deve conter mais de dois caracteres ❌")
    @Size(max = 20, message = "O nome deve conter até 20 caracteres ❌")
    private String nome;

    @NotBlank(message = "Email Obrigatório")
    @Email(message = "Email precisa ser válido")
    private String email;

    @NotBlank(message = "Senha Obrigatória")
    @Size(message = "Precisa ter 8 digitos")
    private String senha;


    @NotBlank(message = "Telefone Obrigatório")
    @Size(message = "Precisa ter 11 digitos")
    private String telefone;

    public FuncionarioRequestDTO() {
    }

    public FuncionarioRequestDTO(String nome, String email, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public @NotBlank(message = "O nome é Obrigatório ❌") @Size(min = 2, message = "O nome deve conter mais de dois caracteres ❌") @Size(max = 20, message = "O nome deve conter até 20 caracteres ❌") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é Obrigatório ❌") @Size(min = 2, message = "O nome deve conter mais de dois caracteres ❌") @Size(max = 20, message = "O nome deve conter até 20 caracteres ❌") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Email Obrigatório") @Email(message = "Email precisa ser válido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email Obrigatório") @Email(message = "Email precisa ser válido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha Obrigatória") @Size(message = "Precisa ter 8 digitos") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha Obrigatória") @Size(message = "Precisa ter 8 digitos") String senha) {
        this.senha = senha;
    }

    public @NotBlank(message = "Telefone Obrigatório") @Size(message = "Precisa ter 11 digitos") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Telefone Obrigatório") @Size(message = "Precisa ter 11 digitos") String telefone) {
        this.telefone = telefone;
    }
}
