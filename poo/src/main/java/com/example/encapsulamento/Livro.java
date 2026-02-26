package com.example.encapsulamento;

public class Livro {

    // ATRIBUTOS

    private String nome;
    private String autor;
    private int isbn;
    private int paginas;
    private double preco;

    // CONSTRUTOR
    
    public Livro(String nome, String autor, int isbn, int paginas, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.preco = preco;
    }
  
    
    
    // MÉTODOS ACESSORES
       


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    

 

    


}
