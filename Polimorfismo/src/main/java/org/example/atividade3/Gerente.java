package org.example.atividade3;

public class Gerente extends Funcionario implements Contratacao {

    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase) {
        super(nome, cpf, dataNascimento, salarioBase);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Desligando: " + funcionario.getNome());
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.obterSalarioFinal() + '\'' +
                '}';
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * Bonificacao.GERENTE.getValor();
    }
}
