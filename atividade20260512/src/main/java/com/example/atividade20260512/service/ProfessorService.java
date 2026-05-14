package com.example.atividade20260512.service;

import com.example.atividade20260512.dto.ProfessorRequestDTO;
import com.example.atividade20260512.dto.ProfessorResponseDTO;
import com.example.atividade20260512.model.ProfessorModel;
import com.example.atividade20260512.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<ProfessorResponseDTO> listarProfessores(){
        return (List<ProfessorResponseDTO>)  repository.findAll().stream().map(ProfessorModel->new ProfessorResponseDTO(ProfessorModel.getNome(),ProfessorModel.getMatricula(),ProfessorModel.getMateria(),ProfessorModel.getContato())).toList();
    }
    public ProfessorModel salvarProfessor(ProfessorRequestDTO profDTO){
        if (repository.findByEmail(profDTO.getEmail()).isPresent()){
            throw new RuntimeException("Professor já Cadastrado. ❌");
        }
        ProfessorModel newProf = new ProfessorModel();
        newProf.setNome(profDTO.getNome());
        newProf.setMatricula(profDTO.getMatricula());
        newProf.setMateria(profDTO.getMateria());
        newProf.setEmail(profDTO.getEmail());
        newProf.setContato(profDTO.getContato());

        return repository.save(newProf);
    }

    public ProfessorModel AtualizarProf(Long id, ProfessorRequestDTO profeDTO){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Professor não encontrado! ❌");
        }
        ProfessorModel profUp = repository.findById(id).get();
        profUp.setNome(profeDTO.getNome());
        profUp.setMatricula(profeDTO.getMatricula());
        profUp.setMateria(profeDTO.getMateria());
        profUp.setEmail(profeDTO.getEmail());
        profUp.setContato(profeDTO.getContato());

        return repository.save(profUp);

    }
    public void apagarProf(Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Professor não encontrado. ❌");
        }
        repository.deleteById(id);
    }


}
