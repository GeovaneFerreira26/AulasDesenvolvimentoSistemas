package com.example.encapsulamento;

public class Veiculo {

    // ATRIBUTOS PRIVADOS
    private String placa;
    private String cor;
    private int ocupacao;
    private double tanque;
    private double velocidade ;
    private double consumoMedio;
    
    // MÉTODO CONSTRUTOR
    public Veiculo(String placa, String cor, int ocupacao, double tanque, double velocidade, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.ocupacao = ocupacao;
        this.tanque = tanque;
        this.velocidade = velocidade;
        this.consumoMedio = consumoMedio;
    }
    
    // MÉTODOS ACESSORES GETTER E SETTER



    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(int ocupacao) {
        this.ocupacao = ocupacao;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }



    

    

}
