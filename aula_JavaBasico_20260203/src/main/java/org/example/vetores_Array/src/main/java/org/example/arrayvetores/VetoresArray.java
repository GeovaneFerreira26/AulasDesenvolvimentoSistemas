package org.example.arrayvetores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VetoresArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a Primeira Nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Informe a Segunda Nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Informe a Terceira Nota: ");
        double nota3 = input.nextDouble();

        double[] notas = new double[3];

        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;

        for (int i = 0; i < 3; i++){
            System.out.println("Nota: " + notas[i]);
        }
    }
}
