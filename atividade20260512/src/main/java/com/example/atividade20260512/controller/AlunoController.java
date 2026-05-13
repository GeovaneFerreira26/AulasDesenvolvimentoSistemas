package com.example.atividade20260512.controller;


import com.example.atividade20260512.dto.AlunoRequestDTO;
import com.example.atividade20260512.dto.AlunoResponseDTO;
import com.example.atividade20260512.service.AlunoService;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/alunos")

public class AlunoController {
    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<AlunoResponseDTO>> listarAlunos(){
        return  ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> registrarAluno(@RequestBody @Valid AlunoRequestDTO alunoDTO){
        service.saveAluno(alunoDTO);
        return  ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Aluno Cadastrado com Sucesso ✅"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>modificarAluno(@PathVariable Long id, @RequestBody @Valid AlunoRequestDTO alunoDTO){
        service.updateAluno(id, alunoDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Aluno atualizado com sucesso ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarAluno(@PathVariable Long id){
        service.deletarAluno(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Aluno Cadastrado com sucesso ✅"));
    }
}
