package com.example.atividade3;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Bradesco", "5589", 8754369,
                "CP", 9896.00f, 3500.00f);

        Funcionario func1 = new Funcionario(6632, "Geovane Ferreira", "Rua Vergulindo, 33E",
                "71988775236","ggk@gmail.com", contaBancaria1);
        Funcionario func2 = new Funcionario(6633, "Jéssica Silva", "Rua Andrade Vilela, 47A",
                "71987875632", "jjs@gmail.com", new ContaBancaria("Caixa Econômica","6988", 7538691,
                "CC", 13895.25f, 4200.00f));

        System.out.println("O Funcionário "+ func1.getNome() + " possui saldo de R$" + func1.getContaBancaria().getSaldoAtual());
        System.out.println("A Funcionária "+ func2.getNome() + " possui saldo de R$" + func2.getContaBancaria().getSaldoAtual());
    }
}
