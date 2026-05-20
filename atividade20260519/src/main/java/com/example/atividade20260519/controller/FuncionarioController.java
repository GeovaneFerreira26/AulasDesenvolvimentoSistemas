package com.example.atividade20260519.controller;


import com.example.atividade20260519.dto.FuncionarioRequestDTO;
import com.example.atividade20260519.dto.FuncionarioResponseDTO;
import com.example.atividade20260519.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>> listarFuncionarios(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarFunc());
    }
    @PostMapping
    public ResponseEntity<Map<String, Object>> registrarFunc(@RequestBody @Valid FuncionarioRequestDTO FuncDTO){
        service.salvarFunc(FuncDTO);
        return  ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Funcionário cadastrado com sucesso ✅"));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> alterarFunc(@PathVariable Long id, @RequestBody @Valid FuncionarioRequestDTO funcAltDTO){
        service.updateFunc(id, funcAltDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Funcionário atualizado com sucesso ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarFunc(@PathVariable Long id){
        service.deletarFunc(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Cadastrado deletado com sucesso. ✅"));
    }

}
