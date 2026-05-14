package com.example.atividade20260512.dto;

import com.example.atividade20260512.model.enums.Modalidade;
import com.example.atividade20260512.model.enums.Turno;

public class CursoResponseDTO {
    private String curso;
    private String semestres;
    private Modalidade modalidade;
    private double media;
    private Turno turno;

    public CursoResponseDTO() {
    }

    public CursoResponseDTO(String curso, String semestres, Modalidade modalidade, double media, Turno turno) {
        this.curso = curso;
        this.semestres = semestres;
        this.modalidade = modalidade;
        this.media = media;
        this.turno = turno;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
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
