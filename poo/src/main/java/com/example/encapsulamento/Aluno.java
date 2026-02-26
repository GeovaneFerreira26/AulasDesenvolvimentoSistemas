package com.example.encapsulamento;

public class Aluno {

    private String Aluno;
    private String email;

    public Aluno(String aluno, String email) {
        Aluno = aluno;
        this.email = email;
    }

    public String getAluno() {
        return Aluno;
    }

    public void setAluno(String aluno) {
        Aluno = aluno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    
    

}
