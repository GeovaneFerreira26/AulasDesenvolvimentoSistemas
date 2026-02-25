package com.example.encapsulamento;

public class Main {

    public static void main(String[] args) {
        // ALGORITIMO
        // String nome;
        // int idade;

        // nome = "Geovane";
        // idade = 22;
        
        //PROGRAMAÇÃO ORIENTADA A OBJETO.

        // Cliente cliente1 = new Cliente();
        // cliente1.nome = "Geovane";
        // cliente1.idade = 28;


        // ENCAPSULAMENTO.

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Geovane");
        cliente1.setIdade(28);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Queila");
        cliente2.setIdade(29);


        Pet pet1 = new Pet();
        pet1.setNome("Lupita");
        pet1.setIdade(9);



        Livro lv1 = new Livro();
        lv1.setNome("ALGORITIMO");
        lv1.setPreco(235.00);

        Funcionario func1 = new Funcionario();
        func1.setNome("Geovane Ferreira");
        func1.setCargo("Supervisor");
        func1.setSalario(3489.78);



        System.out.println("-----------------");
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade() + " Anos");
        System.out.println("-----------------");

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade() + " Anos");

        System.out.println("-----------------");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Idade: " + cliente2.getIdade() + " Anos");

        System.out.println("-----------------");
        System.out.println("Livro: " + lv1.getNome());
        System.out.println("Valor: R$" +lv1.getPreco());

        System.out.println("-----------------");
        System.out.println("Funcionário: " + func1.getNome());
        System.out.println("Cargo: " + func1.getCargo());
        System.out.println("Salário: R$" + func1.getSalario());



    }

}
