package com.example.projeto.controller;


import com.example.projeto.model.ProdutoModel;
import com.example.projeto.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutosRepository repository;

    @GetMapping
    public List<ProdutoModel> listarTodos(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produto){
        repository.save(produto);
        return  ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }
}
