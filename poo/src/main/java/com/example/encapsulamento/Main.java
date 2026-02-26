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
           // ESTANCIAR CLASSE.
        Cliente cliente1 = new Cliente("Geovane", 28);
        Cliente cliente2 = new Cliente("Larissa", 29);
        

        Pet pet1 = new Pet("Lupita", 9, "Pischer", "Pequeno", false);
        

        Livro livro1 = new Livro("ALGORITIMO", "Larissa Linspector",856325 ,259, 39.92);
        Livro livro2 = new Livro("COMO SER UBER CONFORT", "GEGEKA DA CROSSER",321456 , 59, 9.99);
        

        Funcionario func1 = new Funcionario();
        func1.setNome("Geovane Ferreira");
        func1.setCargo("Supervisor");
        func1.setSalario(3489.78);

        Aluno aluno1 = new Aluno("Geovane", "geo265@hotmail.com");
        
        Veiculo veiculo[] = new Veiculo[2];
        veiculo[0] = new Veiculo("SJK-9K69", "AZUL", 5, 62, 180, 18.5);
        veiculo[1] = new Veiculo("SkK-9L70", "AZUL", 7, 88, 190, 17.3);

        System.out.println("---- DADOS VEÍCULOS ----");
        System.out.println("");

        // System.out.println("-----------------");
        // System.out.println("Nome: " + pet1.getNome());
        // System.out.println("Idade: " + pet1.getIdade() + " Anos");
        // System.out.println("Raça: " + pet1.getRaca());
        // System.out.println("Porte: " + pet1.getPorte());
        // System.out.println("Alimentação: " + pet1.getAlimentacao());
        
        // // System.out.println("-----------------");
        // System.out.println("Nome: " + cliente1.getNome());
        // System.out.println("Idade: " + cliente1.getIdade() + " Anos");

        // System.out.println("-----------------");
        // System.out.println("Nome: " + cliente2.getNome());
        // System.out.println("Idade: " + cliente2.getIdade() + " Anos");

        // System.out.println("-----------------");
        // System.out.println("Livro: " + livro1.getNome());
        // System.out.println("Autor: " + livro1.getAutor());
        // System.out.println("ISBN: " + livro1.getIsbn());
        // System.out.println("Total de Páginas: " + livro1.getPaginas());
        // System.out.println("Valor: R$" +livro1.getPreco());
        
        // System.out.println("-----------------");
        // System.out.println("Livro: " + livro2.getNome());
        // System.out.println("Autor: " + livro2.getAutor());
        // System.out.println("ISBN: " + livro2.getIsbn());
        // System.out.println("Total de Páginas: " + livro2.getPaginas());
        // System.out.println("Valor: R$" +livro2.getPreco());


        // System.out.println("-----------------");
        // System.out.println("Funcionário: " + func1.getNome());
        // System.out.println("Cargo: " + func1.getCargo());
        // System.out.println("Salário: R$" + func1.getSalario());

        // System.out.println("-----------------");
        // System.out.println("Aluno: " + aluno1.getAluno());
        // System.out.println("Email: " + aluno1.getEmail());




    }

}
