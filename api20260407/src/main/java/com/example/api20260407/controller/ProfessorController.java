package com.example.api20260407.controller;


import com.example.api20260407.model.ProfessorModel;
import com.example.api20260407.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorRepository repository;

    @GetMapping
    public List<ProfessorModel> listarTodos(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<ProfessorModel> salvar (@RequestBody ProfessorModel professor){
        repository.save(professor);

        return  ResponseEntity.status(HttpStatus.CREATED).body(professor);
    }
}
