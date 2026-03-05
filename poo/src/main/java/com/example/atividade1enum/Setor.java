package com.example.atividade1enum;

public enum Setor {
    FINANCEIRO ("Financeiro"),
    RECURSOSHUMANO ("Recursos Humanos"),
    VENDAS ("Vendas"),
    MARKETING ("Marketing");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
