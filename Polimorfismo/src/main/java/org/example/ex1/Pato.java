package org.example.ex1;

public class Pato implements Animal{
    @Override
    public String emitirSom() {
        return "QuacQuac";
    }

    @Override
    public String comer() {
        return "Minhoca";
    }
}
