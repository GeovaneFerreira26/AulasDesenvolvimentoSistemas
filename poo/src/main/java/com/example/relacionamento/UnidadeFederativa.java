package com.example.relacionamento;

public enum UnidadeFederativa {
    BAHIA ("BA"),
    SAOPAULO ("SP"),
    RIODEJANEIRO ("RJ");

    private String texto;

    UnidadeFederativa(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }


}
