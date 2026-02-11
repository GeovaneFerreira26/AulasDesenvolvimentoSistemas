package org.example.arrayvetores;

import java.util.Scanner;

public class VetoresArrayUm {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a Quantidade de Notas: ");
        int quantidade = ler.nextInt();

        double[] notas = new double[quantidade];
        double soma = 0;



        for (int i = 0; i < quantidade; i++){
            System.out.print("Digite a " + (i + 1)+"ª nota: ");
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }



        System.out.println("\nExibindo as Notas: ");
        for (double nota: notas) {
            System.out.println("Nota: " + nota);

        }
        // double media = ((notas[0] + notas[1])/ 2);
        double media = soma / notas.length;
        System.out.println("Média das Notas: " + media);

        ler.close();
    }
}
