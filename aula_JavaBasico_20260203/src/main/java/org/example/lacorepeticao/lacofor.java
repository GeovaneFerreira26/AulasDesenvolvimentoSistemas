package org.example.lacorepeticao;

import java.util.Scanner;

public class lacofor {
    public static void main(String[] args) {
        // Laço de Repetição com FOR

        Scanner input = new Scanner(System.in);

        for (int i = 100; i <= 120; i++){
            if (i % 2 == 0) {
                System.out.println("Valor de i: " + i);
            }
        }
    }
}
