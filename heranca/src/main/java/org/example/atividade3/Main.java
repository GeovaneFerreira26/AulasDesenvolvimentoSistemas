package org.example.atividade3;

public class Main {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("Rua Estela", "90", "E", "41509999", "SSA");

        Medico med1 = new Medico("Geovane", "ggk@gmail.com", 2200.00f, end1, "GP25698");

        Engenheiro eng1 = new Engenheiro("Larissa", "lari2@gmail.com", 1500.00f, end1,"LA9852");

        System.out.println(med1.toString());
        System.out.println(eng1.toString());

    }
}
