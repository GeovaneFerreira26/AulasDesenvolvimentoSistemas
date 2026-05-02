package com.example.ativsecurity.controller;


import com.example.ativsecurity.dto.AlunoRequestDTO;
import com.example.ativsecurity.dto.AlunoResponseDTO;
import com.example.ativsecurity.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodosAlunos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrarAluno(@RequestBody @Valid AlunoRequestDTO alunoDTO){
        service.salvarAluno(alunoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Aluno Registrado com Sucesso"));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> updateAluno(@PathVariable Long id, @RequestBody @Valid AlunoRequestDTO alunoDTO){
        service.atualizarAluno(id, alunoDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Aluno Atualizado com Sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarAluno(@PathVariable Long id){
        service.deletarAluno(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Aluno Deletado com Sucesso"));
    }
}
