package com.example.ativ20260505.dto;

import com.example.ativ20260505.model.enums.Sexo;

public class JogadorResponseDTO {

    private String nome;
    private int idade;
    private Sexo sexo;
    private String email;

    public JogadorResponseDTO() {
    }

    public JogadorResponseDTO(String nome, int idade, Sexo sexo, String email) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
