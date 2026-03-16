package org.example.atividade2;

import java.io.Serializable;

public class Diretor extends Funcionario implements Contratacao {

    private double premio = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, double premio) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public double salarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "premio=" + premio +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
