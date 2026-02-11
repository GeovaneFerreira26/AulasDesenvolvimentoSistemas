package org.example.arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAula {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();

        notas.add(10.0);
        notas.add(8.0);

        for (double nota : notas){
            System.out.println("Nota: " + nota);
        }
    }
}
