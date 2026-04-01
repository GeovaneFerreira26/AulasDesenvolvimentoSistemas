package com.example.projeto.controller;

import com.example.projeto.model.ClienteModel;
import com.example.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired // substituto do Construtor
    private ClienteRepository clienteRepository;


    @GetMapping()
    public List listar(){
        return clienteRepository.findAll();
    }

    @PostMapping()
    public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel cliente){
        clienteRepository.save(cliente);

        return  ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }



}
