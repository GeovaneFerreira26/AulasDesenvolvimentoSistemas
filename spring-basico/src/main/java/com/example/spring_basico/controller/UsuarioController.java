package com.example.spring_basico.controller;

import com.example.spring_basico.models.UsuarioModel;
import com.example.spring_basico.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {
    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //CONSULTAR TODOS OS USUARIOS.
    @GetMapping
    public List<UsuarioModel> listarTodos(){
        return usuarioRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel usuario){
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }


}
