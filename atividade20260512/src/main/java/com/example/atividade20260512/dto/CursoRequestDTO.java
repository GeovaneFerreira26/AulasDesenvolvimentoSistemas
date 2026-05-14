package com.example.atividade20260512.dto;

import com.example.atividade20260512.model.enums.Modalidade;
import com.example.atividade20260512.model.enums.Turno;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CursoRequestDTO {

    @NotBlank(message = "Nome do Curso precisa ser preenchido ❌")
    @Size(max = 16, message = "Nome do curso com até 16 caracteres ❌")
    private String curso;

    @NotBlank(message = "Quantidade de semestres precisa ser preenchido ❌")
    @Size(min = 1, message = "Informe um valor ❌")
    private String semestres;

    @NotNull(message = "Modalidade precisa ser selecionada ❌")
    private Modalidade modalidade;

    @NotNull(message = "Informe a média do Curso ❌")
    private double media;

    @NotNull(message = "Selecione o turno desejado ❌")
    private Turno turno;

    public CursoRequestDTO() {
    }

    public CursoRequestDTO(String curso, String semestres, Modalidade modalidade, double media, Turno turno) {
        this.curso = curso;
        this.semestres = semestres;
        this.modalidade = modalidade;
        this.media = media;
        this.turno = turno;
    }

    public @NotBlank(message = "Nome do Curso precisa ser preenchido ❌") @Size(max = 16, message = "Nome do curso com até 16 caracteres ❌") String getCurso() {
        return curso;
    }

    public void setCurso(@NotBlank(message = "Nome do Curso precisa ser preenchido ❌") @Size(max = 16, message = "Nome do curso com até 16 caracteres ❌") String curso) {
        this.curso = curso;
    }

    public @NotBlank(message = "Quantidade de semestres precisa ser preenchido ❌") @Size(min = 1, message = "Informe um valor ❌") String getSemestres() {
        return semestres;
    }

    public void setSemestres(@NotBlank(message = "Quantidade de semestres precisa ser preenchido ❌") @Size(min = 1, message = "Informe um valor ❌") String semestres) {
        this.semestres = semestres;
    }

    public @NotNull(message = "Modalidade precisa ser selecionada ❌") Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(@NotNull(message = "Modalidade precisa ser selecionada ❌") Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    @NotNull(message = "Informe a média do Curso ❌")
    public double getMedia() {
        return media;
    }

    public void setMedia(@NotNull(message = "Informe a média do Curso ❌") double media) {
        this.media = media;
    }

    public @NotNull(message = "Selecione o turno desejado ❌") Turno getTurno() {
        return turno;
    }

    public void setTurno(@NotNull(message = "Selecione o turno desejado ❌") Turno turno) {
        this.turno = turno;
    }
}
