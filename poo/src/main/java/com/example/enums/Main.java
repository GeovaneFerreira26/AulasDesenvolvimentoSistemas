package com.example.enums;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Geovane", Pedido.ABERTO);

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Pedido: " + cliente1.getPedido());

        System.out.println(cliente1.toString());
    }
}
