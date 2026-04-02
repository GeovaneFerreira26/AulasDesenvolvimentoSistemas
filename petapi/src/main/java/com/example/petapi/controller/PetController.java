package com.example.petapi.controller;

import com.example.petapi.model.PetModel;
import com.example.petapi.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetRepository repository;

    @GetMapping
    public List<PetModel> listarPets (){
        return repository.findAll();

    }

    @PostMapping
    public ResponseEntity<PetModel> salvar (@RequestBody PetModel pets){
        repository.save(pets);

        return ResponseEntity.status(HttpStatus.CREATED).body(pets);
    }

}
