package com.example.relacionamento;

public class Main {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua Alves Pacheco","1098","Apt 02 andar 03","40888-900","Salvador", UnidadeFederativa.BAHIA);
        Endereco end2 = new Endereco("Rua Porto Belo","198","Casa Térreo","41588-900","São Paulo", UnidadeFederativa.SAOPAULO);



        Pessoa pessoa1 = new Pessoa(523, "Geovane Ferreira", 32, "71966325842", "ggk@gmail.com",Sexo.MASCULINO, end1);
        Pessoa pessoa2 = new Pessoa(593, "Bruno Rosa", 35, "71965566842", "bruk@gmail.com",Sexo.MASCULINO, new Endereco("Rua Porto Belo","198","Casa Térreo","41588-900","São Paulo", UnidadeFederativa.SAOPAULO));



        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}
