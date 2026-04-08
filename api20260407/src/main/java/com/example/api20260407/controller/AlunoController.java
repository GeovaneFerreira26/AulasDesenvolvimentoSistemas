package com.example.api20260407.controller;


import com.example.api20260407.model.AlunoModel;
import com.example.api20260407.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public List<AlunoModel> listarTodos(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<AlunoModel> salvar (@RequestBody AlunoModel aluno){
        repository.save(aluno);

        return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
    }
}
