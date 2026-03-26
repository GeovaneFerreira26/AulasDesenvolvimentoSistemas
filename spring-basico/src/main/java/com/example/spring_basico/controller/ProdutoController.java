package com.example.spring_basico.controller;


import com.example.spring_basico.models.ProdutoModel;
import com.example.spring_basico.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {
    private ProdutoRepository produtoRepository;
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    //CONSULTAR TODOS OS PRODUTOS.
    @GetMapping
    public List<ProdutoModel> listarTodos(){
    return produtoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<ProdutoModel> salvarProduto(@RequestBody ProdutoModel produto){
        produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

}


