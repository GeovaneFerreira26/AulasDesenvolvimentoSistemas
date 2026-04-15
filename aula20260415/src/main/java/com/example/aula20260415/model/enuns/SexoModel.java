package com.example.aula20260415.model.enuns;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SexoModel {
    MASCULINO ("Masculino"),
    FEMININO ("Feminino");

    private String sexo;
    SexoModel(String sexo){
        this.sexo = sexo;
    }
    @JsonValue
    public String getSexo(){
        return sexo;
    }
}
