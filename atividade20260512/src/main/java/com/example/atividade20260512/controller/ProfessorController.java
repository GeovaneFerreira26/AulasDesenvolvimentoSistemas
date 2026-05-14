package com.example.atividade20260512.controller;

import com.example.atividade20260512.dto.ProfessorRequestDTO;
import com.example.atividade20260512.dto.ProfessorResponseDTO;
import com.example.atividade20260512.service.ProfessorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.ObjectReader;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @GetMapping
    public ResponseEntity<List<ProfessorResponseDTO>> listarProf(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarProfessores());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> gravacaoProf(@RequestBody @Valid ProfessorRequestDTO profeDTO){
        service.salvarProfessor(profeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Professor cadastrado com sucesso ✅"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> modifyProf(@PathVariable Long id, @RequestBody @Valid ProfessorRequestDTO modifyProfDTO){
        service.AtualizarProf(id, modifyProfDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Cadastro Modificado com Sucesso. ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> removerProfe(@PathVariable Long id){
        service.apagarProf(id);
        return  ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagemn", "Cadastro apagado com sucesso. ✅"));
    }
}
