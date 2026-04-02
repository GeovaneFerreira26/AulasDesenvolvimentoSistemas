package com.example.api.controller;


import com.example.api.model.FornecedorModel;
import com.example.api.model.FuncionarioModel;
import com.example.api.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
    @Autowired
    private FornecedorRepository repository;

    @GetMapping
    public List<FornecedorModel> listarFornecedores(){
        return repository.findAll();

    }

    @PostMapping
    public ResponseEntity<FornecedorModel> salvar (@RequestBody FornecedorModel fornecedores){
        repository.save(fornecedores);

        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedores);
    }
}
