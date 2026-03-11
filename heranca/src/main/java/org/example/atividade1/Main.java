package org.example.atividade1;

public class Main {
    public static void main(String[] args) {
        Processador proc1 = new Processador("Intel", "I7 13º Geração", "968Hz");
        Memoria mem1 = new Memoria("Kingston", "DDR5", 16);
        PlacaMae mb1 = new PlacaMae("Gygabite", "Intel", "1175");
        Armazenamento hd1 = new Armazenamento("Sandisk", "UltraHigh", "256GB", "SATA");


        System.out.println(proc1.toString());
        System.out.println(mem1.toString());
        System.out.println(mb1.toString());
        System.out.println(hd1.toString());
    }
}
