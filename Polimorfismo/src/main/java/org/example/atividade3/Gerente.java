package org.example.atividade3;

public class Gerente extends CargoDeConfianca implements Contratacao{
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", Nome='" + Nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + obterSalarioFinal() +
                '}';
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Realizada a Contratação do Funcionário " + funcionario.getNome());

    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Realizado o Desligamento do Funcionário " + funcionario.getNome());
    }

    @Override
    public double obterSalarioFinal() {
        return Bonificacao.GERENTE.getValor() * super.salarioBase;
    }
}
