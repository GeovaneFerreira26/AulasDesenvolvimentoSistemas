package com.example.aula20260415.model;


import com.example.aula20260415.model.enuns.SetorModel;
import com.example.aula20260415.model.enuns.SexoModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_funcionarios")
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String email;
    private double salario;

    @Enumerated(EnumType.STRING)
    private SetorModel setor;
    @Enumerated(EnumType.STRING)
    private SexoModel genero;

    public FuncionarioModel() {
    }

    public FuncionarioModel(Long id, String nome, int idade, String email, double salario, SetorModel setor, SexoModel genero) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.salario = salario;
        this.setor = setor;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public SetorModel getSetor() {
        return setor;
    }

    public void setSetor(SetorModel setor) {
        this.setor = setor;
    }

    public SexoModel getGenero() {
        return genero;
    }

    public void setGenero(SexoModel genero) {
        this.genero = genero;
    }
}
