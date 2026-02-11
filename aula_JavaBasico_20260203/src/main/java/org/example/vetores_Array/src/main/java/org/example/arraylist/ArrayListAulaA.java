package org.example.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAulaA {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        String resposta;
        double notaDoUsuario = 0;

        do{
            do {
                System.out.println("Digite uma Nota: ");
                notaDoUsuario = ler.nextDouble();
            } while (notaDoUsuario < 0 || notaDoUsuario > 10);

            notas.add(notaDoUsuario);

            System.out.println("Deseja inserir mais uma nota? ");
            System.out.println("\nPressione a tecla N para sair. ");

            resposta = ler.next();
        } while(!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas: ");
        for(double nota:notas){
            System.out.println("Nota: " + nota);
        }
    }
}
