package org.example.atividade1;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();

        System.out.println("Soma: " + soma.calcular(25,6));
        System.out.println("Subtração: " + sub.calcular(25,6));
        System.out.println("Multiplicação: " + mult.calcular(25,6));
        System.out.println("Divisão: " + div.calcular(25,5));
    }
}
