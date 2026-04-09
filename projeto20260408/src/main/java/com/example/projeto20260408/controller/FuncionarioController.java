package com.example.projeto20260408.controller;


import com.example.projeto20260408.model.FuncionarioModel;
import com.example.projeto20260408.service.FuncionarioService;
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
    public List<FuncionarioModel> listar(){
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<Object, String>> salvar (@RequestBody FuncionarioModel funcionario){
        service.salvarFuncionario(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem", "Funcionário cadastrado com sucesso. ✅" ));
    }
}
