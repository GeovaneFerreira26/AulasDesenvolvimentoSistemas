package com.example.atividade20260512.service;

import com.example.atividade20260512.dto.AlunoRequestDTO;
import com.example.atividade20260512.dto.AlunoResponseDTO;
import com.example.atividade20260512.model.AlunoModel;
import com.example.atividade20260512.repository.AlunoRepository;
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

    public List<AlunoResponseDTO> listarTodos() {
        return (List<AlunoResponseDTO>) repository.findAll().stream().map(AlunoModel -> new AlunoResponseDTO(AlunoModel.getNome(), AlunoModel.getCpf(), AlunoModel.getIdade(), AlunoModel.getMatricula())).toList();
    }

    public  AlunoModel saveAluno(AlunoRequestDTO alunoDTO){
        if (repository.findByEmail(alunoDTO.getEmail()).isPresent()){
            throw new RuntimeException("Aluno já cadastrado. ❌");
        }
        AlunoModel newAluno = new AlunoModel();
        newAluno.setNome(alunoDTO.getNome());
        newAluno.setCpf(alunoDTO.getCpf());
        newAluno.setIdade(alunoDTO.getIdade());
        newAluno.setMatricula(alunoDTO.getMatricula());
        newAluno.setEmail(alunoDTO.getEmail());

        return repository.save(newAluno);
    }

    public AlunoModel updateAluno(Long id, AlunoRequestDTO alunoDTO){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Aluno não encontrado! ❌");
        }
        AlunoModel upAluno = repository.findById(id).get();
        upAluno.setNome(alunoDTO.getNome());
        upAluno.setCpf(alunoDTO.getCpf());
        upAluno.setIdade(alunoDTO.getIdade());
        upAluno.setMatricula(alunoDTO.getMatricula());
        upAluno.setEmail(alunoDTO.getEmail());

        return repository.save(upAluno);
    }

    public void deletarAluno( Long id){
        if (!repository.existsById(id)){
            throw  new RuntimeException("Aluno não encontrado ");
        }
        repository.deleteById(id);
    }
}
