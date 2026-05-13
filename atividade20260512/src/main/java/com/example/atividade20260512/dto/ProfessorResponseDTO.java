package com.example.atividade20260512.dto;

public class ProfessorResponseDTO {
    private String nome;
    private String matricula;
    private String materia;
    private String contato;

    public ProfessorResponseDTO() {
    }

    public ProfessorResponseDTO(String nome, String matricula, String materia, String contato) {
        this.nome = nome;
        this.matricula = matricula;
        this.materia = materia;
        this.contato = contato;
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
