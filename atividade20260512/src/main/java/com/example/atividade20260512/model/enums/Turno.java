package com.example.atividade20260512.model.enums;

public enum Turno {
    MATUTINO("Matutino"),
    VESPERTINO("Vespertino"),
    NOTURNO("Noturno");

    private String tipoDeTurno;

    Turno(String tipoDeTurno) {
        this.tipoDeTurno = tipoDeTurno;
    }

    public String getTipoDeTurno() {
        return tipoDeTurno;
    }
}
