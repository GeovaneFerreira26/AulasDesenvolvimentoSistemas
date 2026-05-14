package com.example.atividade20260512.model;

import com.example.atividade20260512.model.enums.Modalidade;
import com.example.atividade20260512.model.enums.Turno;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_cursos")
public class CursosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    private String semestres;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Modalidade modalidade;

    @Column(nullable = false)
    private double media;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Turno turno;

    public CursosModel() {
    }

    public CursosModel(Long id, String curso, String semestres, Modalidade modalidade, double media, Turno turno) {
        this.id = id;
        this.curso = curso;
        this.semestres = semestres;
        this.modalidade = modalidade;
        this.media = media;
        this.turno = turno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestres() {
        return semestres;
    }

    public void setSemestres(String semestres) {
        this.semestres = semestres;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
