package org.example.atividade2;

import java.io.Serializable;

public class Diretor extends Funcionario implements Contratacao {

    private static final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, org.example.atividade2.Sexo sexo, org.example.atividade2.Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public void demitir(org.example.atividade2.Funcionario funcionario) {

    }

    @Override
    public void admitir(org.example.atividade2.Funcionario funcionario) {

    }

    @Override
    public double salarioFinal() {
        double salarioFinal = super.salarioBase;
        salarioFinal += super.salarioBase * this.PREMIO;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDiretor{" +
                "PREMIO=" + PREMIO +
                '}';
    }
}
