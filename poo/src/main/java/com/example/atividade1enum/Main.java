package com.example.atividade1enum;

public class Main {
    public static void main(String[] args) {
        Funcionario func2 = new Funcionario("8796", "Larissa Chaves", 5680.20, Setor.FINANCEIRO, Sexo.FEMININO, 27);
        Funcionario func1 = new Funcionario("8799", "Geovane Ferreira", 7680.20, Setor.VENDAS, Sexo.MASCULINO, 31);
        Funcionario func3 = new Funcionario("8709", "Bruno Rosa", 6800.50, Setor.MARKETING, Sexo.MASCULINO, 35);


        System.out.println(func1.toString());
        System.out.println(func2.toString());
        System.out.println(func3.toString());

    }
}
