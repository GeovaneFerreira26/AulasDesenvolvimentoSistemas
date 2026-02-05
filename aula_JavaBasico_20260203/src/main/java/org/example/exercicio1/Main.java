package org.example.exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o Valor da Compra a ser Impresso: ");
        double valorTotal = input.nextDouble();
        System.out.println("Informe a Quantidade de Parcelas: ");
        int numeroParcelas = input.nextInt();

        double valorPrestacao = valorTotal / numeroParcelas;

        System.out.println("+++++++++++++++++++++");
        System.out.println("LOJA MAMÃO COM AÇÚCAR");
        System.out.println("Valor Total da Compra: R$" + valorTotal);
        System.out.println("Valor da Prestação: R$" + valorPrestacao);
    }
}
