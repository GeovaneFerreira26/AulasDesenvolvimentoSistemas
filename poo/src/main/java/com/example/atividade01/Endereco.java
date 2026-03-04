package com.example.atividade01;

public class Endereco {

    // Atributos privados
    private String logradoro;
    private String numero;
    private String cidade;

    // método CONSTRUTOR

    public Endereco(String logradoro, String numero, String cidade) {
        this.logradoro = logradoro;
        this.numero = numero;
        this.cidade = cidade;
    }


    // Método Acessores

    public String getLogradoro() {
        return logradoro;
    }

    public void setLogradoro(String logradoro) {
        this.logradoro = logradoro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


}
