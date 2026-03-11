package org.example;

import org.example.exemplo1.Cliente;
import org.example.exemplo1.Funcionario;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Larissa",25,"22/01/2026", "Cartão");
        Funcionario func1 = new Funcionario("Bruno Rosa", 28, "6325", "Gerente", 12985.60);

        System.out.println("Dados do Cliente:");
        System.out.println("Nome: "+ cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Data de Compra: " + cliente1.getDataDeCompra());
        System.out.println("Forma de Pagamento: " + cliente1.getFormaDePagamento());

        System.out.println(func1.toString());




    }
}