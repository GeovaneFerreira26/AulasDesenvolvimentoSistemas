package com.example.atividade20260512.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_alunos")
public class AlunoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    private String matricula;

    @Column(nullable = false, unique = true)
    private String email;

    public AlunoModel() {
    }

    public AlunoModel(Long id, String nome, String cpf, int idade, String matricula, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.matricula = matricula;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
