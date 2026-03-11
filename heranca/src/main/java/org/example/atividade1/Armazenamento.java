package org.example.atividade1;

public class Armazenamento extends Fabricante{
    private String discorigido;
    private String tipodeconexao;

    public Armazenamento(String marca, String modelo, String discorigido, String tipodeconexao) {
        super(marca, modelo);
        this.discorigido = discorigido;
        this.tipodeconexao = tipodeconexao;
    }

    public String getDiscorigido() {
        return discorigido;
    }

    public void setDiscorigido(String discorigido) {
        this.discorigido = discorigido;
    }

    public String getTipodeconexao() {
        return tipodeconexao;
    }

    public void setTipodeconexao(String tipodeconexao) {
        this.tipodeconexao = tipodeconexao;
    }

    @Override
    public String toString() {
        return "Armazenamento{" +
                "discorigido='" + discorigido + '\'' +
                ", tipodeconexao='" + tipodeconexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
