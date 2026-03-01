package com.example.encapsulamento;

public class Endereco {

    // Atributos privados
    private String logradoro;
    private int numero;
    private String cidade;
    
    // método CONSTRUTOR
    
    public Endereco(String logradoro, int numero, String cidade) {
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    


}
