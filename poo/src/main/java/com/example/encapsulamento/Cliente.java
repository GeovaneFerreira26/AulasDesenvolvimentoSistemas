package com.example.encapsulamento;

public class Cliente {

    // ATRIBUTOS DA CLASSE.
    private String nome;
    int idade;

    // CONSTRUTOR.
    
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }



    // MÉTODOS DE ACESSO.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    

}
