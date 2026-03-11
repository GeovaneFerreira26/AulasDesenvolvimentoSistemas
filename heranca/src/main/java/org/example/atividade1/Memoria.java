package org.example.atividade1;

public class Memoria extends Fabricante{
    private int capacidadeArmazenamento;

    public Memoria(String marca, String modelo, int capacidadeArmazenamento) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeArmazenamento='" + capacidadeArmazenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
