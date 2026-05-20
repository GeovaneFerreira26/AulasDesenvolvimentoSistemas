package com.example.atividade20260519.service;


import com.example.atividade20260519.dto.FuncionarioRequestDTO;
import com.example.atividade20260519.dto.FuncionarioResponseDTO;
import com.example.atividade20260519.model.EnderecoModel;
import com.example.atividade20260519.model.FuncionarioModel;
import com.example.atividade20260519.repository.FuncionarioRepository;
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

    public List<FuncionarioResponseDTO>listarFunc(){
        return repository.findAll().stream().map(funcionario -> new FuncionarioResponseDTO(funcionario.getNome(), funcionario.getMatricula(), funcionario.getDataNascimento(), funcionario.getEmail(), funcionario.getEndereco())).toList();

    }

    public FuncionarioModel salvarFunc(FuncionarioRequestDTO funcDTO){
        if (repository.findByEmail(funcDTO.getEmail()).isPresent()){
            throw  new RuntimeException("Funcionário já cadastrado. ❌");
        }
        FuncionarioModel newFunc = new FuncionarioModel();
        newFunc.setNome(funcDTO.getNome());
        newFunc.setMatricula(funcDTO.getMatricula());
        newFunc.setDataNascimento(funcDTO.getDataNascimento());
        newFunc.setSalario(funcDTO.getSalario());
        newFunc.setEmail(funcDTO.getEmail());
        newFunc.setEndereco(funcDTO.getEndereco());

        return repository.save(newFunc);
    }

    public FuncionarioModel updateFunc (Long id, FuncionarioRequestDTO funcUpDTO){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado ❌");
        }
        FuncionarioModel upFunc = new FuncionarioModel();

        upFunc.setId(id);
        upFunc.setNome(funcUpDTO.getNome());
        upFunc.setMatricula(funcUpDTO.getMatricula());
        upFunc.setDataNascimento(funcUpDTO.getDataNascimento());
        upFunc.setSalario(funcUpDTO.getSalario());
        upFunc.setEmail(funcUpDTO.getEmail());
        upFunc.getEndereco().setId(id);

        return repository.save(upFunc);
    }

    public void deletarFunc(Long id){
        if (!repository.existsById(id)){
            throw  new RuntimeException("Funcionário não encontrado. ❌");
        }
        repository.deleteById(id);
    }


}
