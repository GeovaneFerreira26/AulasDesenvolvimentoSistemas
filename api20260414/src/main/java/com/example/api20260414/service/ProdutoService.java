package com.example.api20260414.service;


import com.example.api20260414.model.ProdutoModel;
import com.example.api20260414.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoModel> listarProdutos(){
        return repository.findAll();
    }

    public ProdutoModel salvarProduto (ProdutoModel produto){
        if(repository.findByNome(produto.getNome()).isPresent()){
            throw  new RuntimeException("Produto já cadastrado. ❌");
        }
        return repository.save(produto);
    }
    public ProdutoModel atualizarProduto(Long id, ProdutoModel produto){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Produto não encontrado 🔎");
        }
        produto.setId(id);
        return repository.save(produto);
    }
    public void excluirProduto(Long id){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException(("Produto não encontrado 🔎"));

        }
        repository.deleteById(id);
    }
}
