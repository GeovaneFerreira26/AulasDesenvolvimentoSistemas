package org.example.atividade2;

public class Main {
    public static void main(String[] args) {

        Diretor diretor1 = new Diretor("Geovane Ferreira", "26/05/1985", Sexo.MASCULINO, Setor.FINANCEIRO, 15000.26f, 200);


        System.out.println(diretor1.toString());

    }
}
