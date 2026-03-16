package org.example.atividade2;

public enum Setor {
    RECURSOSHUMANOS ("Recursos Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operações");

    private String setorTexto;

    Setor(String setorTexto) {
        this.setorTexto = setorTexto;
    }
    public String getSetorTexto() {
        return setorTexto;
    }



}
