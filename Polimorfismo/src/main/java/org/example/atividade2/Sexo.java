package org.example.atividade2;

public enum Sexo {
    MASCULINO ("Masculino"),
    FEMININO ("Feminino");

    private String sexoTexto;

    Sexo(String sexoTexto) {
        this.sexoTexto = sexoTexto;
    }
    public String getSexoTexto() {
        return sexoTexto;
    }

}
