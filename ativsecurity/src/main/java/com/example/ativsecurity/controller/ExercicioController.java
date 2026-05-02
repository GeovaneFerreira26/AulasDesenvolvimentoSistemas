package com.example.ativsecurity.controller;


import com.example.ativsecurity.dto.ExercicioRequestDTO;
import com.example.ativsecurity.dto.ExercicioResponseDTO;
import com.example.ativsecurity.service.ExercicioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/exercicios")
public class ExercicioController {

    @Autowired
    private ExercicioService service;

    @GetMapping
    public ResponseEntity<List<ExercicioResponseDTO>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> save (@Valid @RequestBody ExercicioRequestDTO ExercicioDTO){
        service.saveExer(ExercicioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Exercicio cadastrado com sucesso. ✅"));
    }
}
