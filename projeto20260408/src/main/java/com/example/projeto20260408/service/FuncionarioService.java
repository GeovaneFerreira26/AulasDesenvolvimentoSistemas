package com.example.projeto20260408.service;


import com.example.projeto20260408.model.FuncionarioModel;
import com.example.projeto20260408.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioModel> listarTodos(){
        return repository.findAll();
    }

    public FuncionarioModel salvarFuncionario (FuncionarioModel funcionario){
        // Verifica se o Cliente não está cadastrado no banco de dados
        // antes de salvar.
        if (repository.findByMatricula(funcionario.getMatricula()).isPresent()){
            throw  new IllegalArgumentException("Funcionário já cadastrado. ✅");
        }
        return repository.save(funcionario);
    }
}
