package com.example.encapsulamento;

public class Funcionario {

    // ATRIBUTOS.
    private int codFuncionario;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    private int contaBancaria;
    private String cargo;
    private double salario;
    // metodo construtor
    
    public Funcionario(int codFuncionario, String nome, String endereco, int telefone, String email, int contaBancaria,
            String cargo, double salario) {
        this.codFuncionario = codFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
        this.cargo = cargo;
        this.salario = salario;
    }
    // MÉTODOS ACESSORES
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getCodFuncionario() {
        return codFuncionario;
    }
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getContaBancaria() {
        return contaBancaria;
    }
    public void setContaBancaria(int contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    

}
