package com.example.revisao;

public class Main {
    public static void main(String[] args) {
        // instaciamento da classe professor
        Professor prof1 = new Professor("Gegeka", "ggg@hotmail", "DS");
        Professor prof2 = new Professor("Bruno", "b1@gmail.com", "Matematica");

        System.out.println(prof1.getNome());
        System.out.println("O Professor "+prof2.getNome()+ " ensina matéria " + prof2.getDisciplina());

    }
}
