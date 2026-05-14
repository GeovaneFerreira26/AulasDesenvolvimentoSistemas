package com.example.atividade20260512.controller;

import com.example.atividade20260512.dto.CursoRequestDTO;
import com.example.atividade20260512.dto.CursoResponseDTO;
import com.example.atividade20260512.service.CursosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursosService service;

    @GetMapping
    public ResponseEntity<List<CursoResponseDTO>> cursosList(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarCursos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> registrarCurso(@RequestBody @Valid CursoRequestDTO cursoGravDTO){
        service.cadastroCursos(cursoGravDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Cadastro Efetuado com Sucesso ✅"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> alterarDadosCurso(@PathVariable Long id, @RequestBody @Valid CursoRequestDTO modifyCursoDTO){
        service.modifyCurso(id, modifyCursoDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Cadastrado modificado com sucesso ✅"));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> apagarDadosCurso(@PathVariable Long id){
        service.removerCurso(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Cadastro deletado com sucesso. ✅"));
    }

}
