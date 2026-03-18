package org.example.atividade2;

public class Main {
    public static void main(String[] args) {

        Diretor diretor1 = new Diretor("Geovane Ferreira", "26/05/1985", Sexo.MASCULINO, Setor.FINANCEIRO, 15000.26f);
        Motoboy boy1 = new Motoboy("Larissa Santos", "20/10/1999", Sexo.FEMININO, Setor.OPERACOES, 1500, "cnh8565896");

        System.out.println(diretor1.toString());
        System.out.println(boy1.toString());

    }
}
