package com.example.atividade20260519.dto;

import com.example.atividade20260519.model.EnderecoModel;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class FuncionarioRequestDTO {

    @NotBlank(message = "Nome precisa ser inserido ❌")
    @Size(min = 3, max = 20, message = "O nome precisa ter até 20 caracteres ❌")
    private String nome;

    @NotBlank(message = "Matricula precisa ser registrada ❌")
    @Size(min = 3, max = 9, message = "A Matricula precisa ter até 9 caracteres ❌")
    private String matricula;

    @NotBlank(message = "Data de Nascimento precisa ser inserido ❌")
    @Size(min = 3, max = 10, message = "A Data precisa conter até 10 caracteres ❌")
    private String dataNascimento;

    @NotNull(message = "Informe o Salário ❌")
    private double salario;

    @NotBlank(message = "Email precisa ser informado ❌")
    @Size(min = 3, max = 20, message = "O email precisa ter até 20 caracteres ❌")
    private String email;

    @NotNull(message = "Informe o Endereço ❌")
    private EnderecoModel endereco;

    public FuncionarioRequestDTO() {
    }

    public FuncionarioRequestDTO(String nome, String matricula, String dataNascimento, double salario, String email, EnderecoModel endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
    }

    public @NotBlank(message = "Nome precisa ser inserido ❌") @Size(min = 3, max = 20, message = "O nome precisa ter até 20 caracteres ❌") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome precisa ser inserido ❌") @Size(min = 3, max = 20, message = "O nome precisa ter até 20 caracteres ❌") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Matricula precisa ser registrada ❌") @Size(min = 3, max = 9, message = "A Matricula precisa ter até 9 caracteres ❌") String getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "Matricula precisa ser registrada ❌") @Size(min = 3, max = 9, message = "A Matricula precisa ter até 9 caracteres ❌") String matricula) {
        this.matricula = matricula;
    }

    public @NotBlank(message = "Data de Nascimento precisa ser inserido ❌") @Size(min = 3, max = 10, message = "A Data precisa conter até 10 caracteres ❌") String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotBlank(message = "Data de Nascimento precisa ser inserido ❌") @Size(min = 3, max = 10, message = "A Data precisa conter até 10 caracteres ❌") String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @NotNull(message = "Informe o Salário ❌")
    public double getSalario() {
        return salario;
    }

    public void setSalario(@NotNull(message = "Informe o Salário ❌") double salario) {
        this.salario = salario;
    }

    public @NotBlank(message = "Email precisa ser informado ❌") @Size(min = 3, max = 20, message = "O email precisa ter até 20 caracteres ❌") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email precisa ser informado ❌") @Size(min = 3, max = 20, message = "O email precisa ter até 20 caracteres ❌") String email) {
        this.email = email;
    }

    public @NotNull(message = "Informe o Endereço ❌") EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotNull(message = "Informe o Endereço ❌") EnderecoModel endereco) {
        this.endereco = endereco;
    }
}
