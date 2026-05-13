package com.example.atividade20260512.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_professores")
public class ProfessorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String matricula;

    @Column(nullable = false)
    private String materia;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String contato;

    public ProfessorModel() {
    }

    public ProfessorModel(Long id, String nome, String matricula, String materia, String email, String contato) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.materia = materia;
        this.email = email;
        this.contato = contato;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
