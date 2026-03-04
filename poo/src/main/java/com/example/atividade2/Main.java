package com.example.atividade2;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Lupita", 9,"Pinscher");

        Cliente cliente1 = new Cliente("Geovane", 28, pet1);


        Cliente cliente2 = new Cliente("Larissa", 26, new Pet("Preta", 8, "PitBull Terrier"));

        System.out.println("Nome " + cliente1.getNome());
        System.out.println("Nome do Pet de "+ cliente1.getNome()+ " é "+cliente1.getPet().getNome() +" da raça " + cliente1.getPet().getRaca());
        System.out.println("Nome do Pet de "+ cliente2.getNome()+ " é "+cliente2.getPet().getNome() +" da raça " + cliente2.getPet().getRaca());

    }
}
