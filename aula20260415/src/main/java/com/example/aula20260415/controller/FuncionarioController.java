package com.example.aula20260415.controller;


import com.example.aula20260415.model.FuncionarioModel;
import com.example.aula20260415.service.FuncionarioService;
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
        service.salvarFunc(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Funcionário cadastrado com sucesso ✅"));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar (@PathVariable Long id, @RequestBody FuncionarioModel funcionario){
        service.updateFunc(id, funcionario);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Funcionário atualizado com sucesso. ✅"));
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Map<String, Object>> excluir(@PathVariable Long id){
        service.deleteFunc(id);;

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Funcionário Excluído com sucesso. ✅"));
    }



}
