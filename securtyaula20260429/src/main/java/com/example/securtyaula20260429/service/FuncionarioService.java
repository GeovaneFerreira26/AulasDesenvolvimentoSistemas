package com.example.securtyaula20260429.service;


import com.example.securtyaula20260429.dto.FuncionarioRequestDTO;
import com.example.securtyaula20260429.dto.FuncionarioResponseDTO;
import com.example.securtyaula20260429.model.FuncionarioModel;
import com.example.securtyaula20260429.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioResponseDTO> listarTodos(){
        return repository.findAll().stream().map(funcionario -> new FuncionarioResponseDTO(funcionario.getNome(), funcionario.getEmail(), funcionario.getTelefone())).toList();
    }

    public FuncionarioModel salvarFunc(FuncionarioRequestDTO funcionarioDTO){
        if(repository.findByEmail(funcionarioDTO.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário já Cadastrado ❌");
        }
        FuncionarioModel newFunc = new FuncionarioModel();
        newFunc.setNome(funcionarioDTO.getNome());
        newFunc.setEmail(funcionarioDTO.getEmail());
        newFunc.setSenha(passwordEncoder.encode(funcionarioDTO.getSenha()));
        newFunc.setTelefone(funcionarioDTO.getTelefone());

        return repository.save(newFunc);
    }
}
