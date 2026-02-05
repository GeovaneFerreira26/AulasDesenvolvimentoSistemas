package org.example.lacorepeticao;

import java.util.Scanner;

public class LacoRepeticao {
    public static void main(String[] args) {
        // Laço de Repetição com WHILE

        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua Idade: ");
        int idade = input.nextInt();

        while (idade < 18){
            System.out.println("\nesso Negado.❌");
            System.out.println("Digite sua Idade: ");
            idade = input.nextInt();
        }
        System.out.println("\nAcesso Permitido ✅");
        System.out.println("Carregando..");

    }
}
