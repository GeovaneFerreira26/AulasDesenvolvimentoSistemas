package org.example.ex1;

public class Galo implements Animal {
    @Override
    public String emitirSom() {
        return "Cocoricó";
    }

    @Override
    public String comer() {
        return "Milho";
    }
}
