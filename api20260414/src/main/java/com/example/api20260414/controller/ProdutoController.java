package com.example.api20260414.controller;


import com.example.api20260414.model.ProdutoModel;
import com.example.api20260414.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<ProdutoModel> listarProduto(){
        return service.listarProdutos();
    }

    @PostMapping
    public ResponseEntity<Map<Object, String>> salvar (@RequestBody ProdutoModel produto){
        service.salvarProduto(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem", "Produto cadastrado com sucesso ✅"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<Object, String>> atualizarProduto(@PathVariable Long id, @RequestBody ProdutoModel produto){
        service.atualizarProduto(id, produto);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Produto cadastrado com sucesso ✅"));
    }
    
    @DeleteMapping ("{id}")
    public ResponseEntity<Map<String, Object>> excluirProduto(@PathVariable Long id){
        service.excluirProduto(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Produto cadastrado com sucesso ✅"));
    }




}
