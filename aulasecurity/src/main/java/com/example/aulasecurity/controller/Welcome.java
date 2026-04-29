package com.example.aulasecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String mensagem(){
        return "Bem-Vindo, Geovane!";
    }
    @GetMapping("/dev")
    public String nomeDev(){
        return "Desenvolvido por Geovane Ferreira!";
    }
}
