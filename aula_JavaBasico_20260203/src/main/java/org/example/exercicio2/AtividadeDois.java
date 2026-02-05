package org.example.exercicio2;

import java.util.Scanner;


public class AtividadeDois {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe no Nome do Aluno: ");
        String aluno = input.nextLine();

        System.out.print("Informe a Primeira Nota do Aluno: ");
        double nota1 = input.nextDouble();

        System.out.print("Informe a Segunda Nota do Aluno: ");
        double nota2 = input.nextDouble();

        double mediaTotal = (nota1 + nota2) / 2;


        System.out.println("\nA Média do aluno " + aluno + " foi de " + mediaTotal + " pontos.");
        //System.out.println("O Aluno está:");
        if (mediaTotal >= 7) {
            System.out.println("Aluno Aprovado ✅");
        }else{
            System.out.println("Aluno Reprovado ❌");
        }


    }
}
