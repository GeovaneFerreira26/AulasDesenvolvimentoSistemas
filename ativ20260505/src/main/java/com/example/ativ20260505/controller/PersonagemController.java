package com.example.ativ20260505.controller;


import com.example.ativ20260505.dto.PersonagemRequestDTO;
import com.example.ativ20260505.dto.PersonagemResponseDTO;
import com.example.ativ20260505.service.PersonagemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {
    @Autowired
    private PersonagemService service;

    @GetMapping
    public ResponseEntity<List<PersonagemResponseDTO>>listarPerson(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrarPerson(@RequestBody @Valid PersonagemRequestDTO personagemRequestDTO){
        service.salvarPers(personagemRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Personagem registrado com sucesso ✅"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> updatePerson(@PathVariable Long id, @RequestBody @Valid PersonagemRequestDTO personagemRequestDTO){
        service.updatePerson(id, personagemRequestDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Personagem atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarPerson(@PathVariable Long id){
        service.deletarPerson(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Personagem deletado com sucesso. ✅"));
    }

}
