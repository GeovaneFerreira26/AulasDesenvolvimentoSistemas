package com.example.atividade20260512.dto;

public class AlunoResponseDTO {
    private String nome;
    private String cpf;
    private int idade;
    private String matricula;

    public AlunoResponseDTO() {
    }

    public AlunoResponseDTO(String nome, String cpf, int idade, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
