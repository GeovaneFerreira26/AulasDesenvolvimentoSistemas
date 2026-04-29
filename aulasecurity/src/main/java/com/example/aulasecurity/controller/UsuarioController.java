package com.example.aulasecurity.controller;

import com.example.aulasecurity.dto.UsuarioRequestDTO;
import com.example.aulasecurity.dto.UsuarioResponseDTO;
import com.example.aulasecurity.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired

    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(
            @Valid @RequestBody UsuarioRequestDTO usuarioDTO){
        service.salvarUser(usuarioDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Usuário cadastrado com Sucesso. ✅"));
    }



}
