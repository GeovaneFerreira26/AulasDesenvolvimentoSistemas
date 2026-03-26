package com.example.spring_basico.controller;

import com.example.spring_basico.models.ClienteModel;
import com.example.spring_basico.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
    private ClienteRepository clienteRepository;
    public ClienteController(ClienteRepository clienteRepository) {this.clienteRepository = clienteRepository;}

    //CONSULTAR TODOS OS CLIENTES
    @GetMapping
    public List<ClienteModel> listarClientes(){
        return clienteRepository.findAll();
    }
    @PostMapping
    public ResponseEntity<ClienteModel> salvarCliente(@RequestBody ClienteModel cliente){
        clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }
}
