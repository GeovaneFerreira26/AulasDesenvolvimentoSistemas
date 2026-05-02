package com.example.ativsecurity.service;


import com.example.ativsecurity.dto.AlunoRequestDTO;
import com.example.ativsecurity.dto.AlunoResponseDTO;
import com.example.ativsecurity.model.AlunoModel;
import com.example.ativsecurity.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<AlunoResponseDTO> listarTodosAlunos() {
        return repository.findAll().stream().map(aluno -> new AlunoResponseDTO(aluno.getId(), aluno.getNome(), aluno.getEmail(), aluno.getIdade())).toList();

    }

    public AlunoModel salvarAluno(AlunoRequestDTO alunoDTO){
        if(repository.findByEmail(alunoDTO.getEmail()).isPresent()){
            throw new RuntimeException("Aluno Já Cadastrado X❌");
        }
        AlunoModel newAluno = new AlunoModel();
        newAluno.setNome(alunoDTO.getNome());
        newAluno.setEmail(alunoDTO.getEmail());
        newAluno.setIdade(alunoDTO.getIdade());
        newAluno.setSenha(passwordEncoder.encode(alunoDTO.getSenha()));

        return  repository.save(newAluno);
    }

    public AlunoModel atualizarAluno(Long id, AlunoRequestDTO alunoDTO){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Aluno não encontrado ❌");
        }
        AlunoModel newAluno = repository.findById(id).get();
        newAluno.setNome(alunoDTO.getNome());
        newAluno.setEmail(alunoDTO.getEmail());
        newAluno.setIdade(alunoDTO.getIdade());
        newAluno.setSenha(alunoDTO.getSenha());

        return  repository.save(newAluno);
    }

    public void deletarAluno(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Aluno não encontrado ❌");
        }
        repository.deleteById(id);
    }



}
