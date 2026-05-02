package com.example.ativsecurity.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> RuntimeException(RuntimeException erro) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("Mensagem", erro.getMessage()));
    }

    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<Map<String, Object>> IllegalAccessException(IllegalAccessException erro) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("Mensagem", erro.getMessage()));
    }
}
