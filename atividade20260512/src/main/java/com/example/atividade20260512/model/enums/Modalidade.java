package com.example.atividade20260512.model.enums;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum Modalidade {
    EAD("EAD"),
    PRESENCIAL("Presencial");

    private String tipoModalidade;

    Modalidade(String tipoModalidade) {
        this.tipoModalidade = tipoModalidade;
    }

    public String getTipoModalidade() {
        return tipoModalidade;
    }

}
