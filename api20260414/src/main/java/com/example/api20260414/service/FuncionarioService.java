package com.example.api20260414.service;


import com.example.api20260414.model.FuncionarioModel;
import com.example.api20260414.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioModel> listarTodos() {
        return repository.findAll();
    }

    public FuncionarioModel salvarFuncionario(FuncionarioModel funcionario) {
        if (repository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new RuntimeException("Funcionário já cadastrado. ❌");

        }
        return repository.save(funcionario);
    }

    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel funcionario) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Funcionário não encontrdo. 🔎");
        }
        // Mantém o ID para não Criar outro Funcionário
        //Altera todos os outros dados

        funcionario.setId(id);
        return repository.save(funcionario);
    }

    public void excluir(Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Funcionário não encontrdo. 🔎");
        }
        repository.deleteById(id);
    }
}