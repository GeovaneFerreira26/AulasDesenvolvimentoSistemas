package org.example.atividade4;

public enum Bonificacao {
    GERENTE (1.2),
    DIRETOR (1.4);

    protected double valor;
    private Bonificacao(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
}
