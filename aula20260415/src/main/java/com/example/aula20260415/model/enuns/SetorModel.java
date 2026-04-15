package com.example.aula20260415.model.enuns;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SetorModel {
    FINANCEIRO ("Financeiro"),
    RECURSOSHUMANOS ("Recursos Humanos"),
    VENDAS ("Vendas"),
    MARKETING ("Marketing");

    private String setor;
    SetorModel(String setor){
        this.setor = setor;
    }
    @JsonValue
    public String getSetor(){
        return setor;
    }
}
