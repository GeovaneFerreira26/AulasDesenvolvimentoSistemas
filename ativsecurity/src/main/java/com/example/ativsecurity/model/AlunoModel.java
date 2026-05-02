package com.example.ativsecurity.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tab_alunos")
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private Integer idade;

    @Column(nullable = false, precision = 8)
    private String senha;

    public AlunoModel() {
    }

    public AlunoModel(Long id, String nome, String email, Integer idade, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.senha = senha;
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
