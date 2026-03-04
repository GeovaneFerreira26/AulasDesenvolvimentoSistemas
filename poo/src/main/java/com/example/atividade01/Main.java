package com.example.atividade01;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "90", "Salvador");
        Cliente cliente1 = new Cliente("Geovane", 28, endereco1);

        System.out.println("Nome: "+cliente1.getNome());
        System.out.println("Cidade: "+ cliente1.getEndereco().getCidade());


    }
}
