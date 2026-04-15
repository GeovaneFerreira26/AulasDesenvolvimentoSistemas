package com.example.aula20260415.service;

import com.example.aula20260415.model.FuncionarioModel;
import com.example.aula20260415.repository.FuncionarioRepository;
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

    public FuncionarioModel salvarFunc(FuncionarioModel funcionario){
        if (repository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário já Cadastrado. ❌ ");
        }
        return repository.save(funcionario);
    }
    public FuncionarioModel updateFunc(Long id, FuncionarioModel funcionario){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado. 🔎");
        }
        funcionario.setId(id);
        return repository.save(funcionario);
    }

    public void deleteFunc(Long id){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado. 🔎");
        }
        repository.deleteById(id);
    }
}
