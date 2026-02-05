package org.example.relacionais;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Declaração de Variáveis

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");

        int valorA = input.nextInt();

        System.out.println("Informe o valor de B: ");

        int valorB = input.nextInt();
        //int a = 10;
        //int b = 20;
        int maior;

        // Operadores aritméticos

        if (valorA > valorB){
            maior = valorA;
        }else{
            maior = valorB;
        }
        // Exibindo resultados
        System.out.println("O Maior número é: " + maior);
    }
}
