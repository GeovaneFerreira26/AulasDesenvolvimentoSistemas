package com.example.ativsecurity.service;

import com.example.ativsecurity.dto.ExercicioRequestDTO;
import com.example.ativsecurity.dto.ExercicioResponseDTO;
import com.example.ativsecurity.model.ExercicioModel;
import com.example.ativsecurity.repository.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercicioService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private ExercicioRepository repository;

    public List<ExercicioResponseDTO> listarTodos() {
        return repository.findAll().stream().map(exercicio -> new ExercicioResponseDTO(exercicio.getId(), exercicio.getNome(), exercicio.getGrupoMuscular(), exercicio.getRepeticoes(), exercicio.getSeries())).toList();
    }

    public ExercicioModel saveExer(ExercicioRequestDTO execicioDTO) {
        if(repository.findByNome(execicioDTO.getNome()).isPresent()) {
            throw new RuntimeException("Exercício já Cadastrado, ação não permitida! ✅");
        }
        ExercicioModel newExercicio = new ExercicioModel();
        newExercicio.setNome(execicioDTO.getNome());
        newExercicio.setGrupoMuscular(execicioDTO.getGrupoMuscular());
        newExercicio.setRepeticoes(execicioDTO.getRepeticoes());
        newExercicio.setSeries(execicioDTO.getSeries());

        return repository.save(newExercicio);
    }
}
