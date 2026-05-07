package com.example.ativ20260505.model.enums;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String tipoSexo;

    Sexo(String tipoSexo) {
        this.tipoSexo = tipoSexo;
    }

    public String getTipoSexo() {
        return tipoSexo;
    }
}
