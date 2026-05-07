package com.example.ativ20260505.controller;

import com.example.ativ20260505.dto.CenarioRequestDTO;
import com.example.ativ20260505.dto.CenarioResponseDTO;
import com.example.ativ20260505.service.CenarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.ObjectReader;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cenarios")
public class CenarioController {
    @Autowired
    private CenarioService service;

    @GetMapping
    public ResponseEntity<List<CenarioResponseDTO>>listarCenario(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> registrarCenario(@RequestBody @Valid CenarioRequestDTO cenarioDTO){
        service.saveCenario(cenarioDTO);
        return  ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Cenário cadastrado com sucesso ✅"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarCenario(@PathVariable Long id, @RequestBody @Valid CenarioRequestDTO cenarioDTO){
        service.atualizar(id, cenarioDTO);
        return  ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Cenário atualizado com sucesso. ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> delCenario(@PathVariable Long id){
        service.delCenario(id);
        return  ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Cénario deletado com sucesso. ✅"));
    }


}
