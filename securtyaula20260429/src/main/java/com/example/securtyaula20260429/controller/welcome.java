package com.example.securtyaula20260429.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {

    @RequestMapping("/")
    public String mensagem(){
        return "Bem Vindo";
    }

    @RequestMapping("/dev")
    public String mensagemDev(){
        return "Desenvolvido por Gegeka ✅";
    }
}
