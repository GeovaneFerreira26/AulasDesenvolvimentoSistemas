package com.example.ativ20260505.controller;


import com.example.ativ20260505.dto.JogadorRequestDTO;
import com.example.ativ20260505.dto.JogadorResponseDTO;
import com.example.ativ20260505.service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService service;

    @GetMapping
    public ResponseEntity<List<JogadorResponseDTO>>listarJogadores(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>>registrarJogador(@RequestBody @Valid JogadorRequestDTO playerDTO){
        service.salvarJogador(playerDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Jogador registrado com sucesso ✅"));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>updatePlayer(@PathVariable Long id, @RequestBody @Valid JogadorRequestDTO JogadorDTO){
        service.atualizar(id, JogadorDTO);
        return  ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Jogador atualizado com sucesso ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>>deletarPlayer(@PathVariable Long id){
        service.deletarJogdor(id);
        return  ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Jogador excluído com Sucesso. ✅"));
    }
}
