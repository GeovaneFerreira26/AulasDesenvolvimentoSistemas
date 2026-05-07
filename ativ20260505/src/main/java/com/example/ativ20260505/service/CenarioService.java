package com.example.ativ20260505.service;

import com.example.ativ20260505.dto.CenarioRequestDTO;
import com.example.ativ20260505.dto.CenarioResponseDTO;
import com.example.ativ20260505.model.CenarioModel;
import com.example.ativ20260505.repository.CenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenarioService {

    @Autowired
    private CenarioRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<CenarioResponseDTO> listarTodos(){
        return (List<CenarioResponseDTO>) repository.findAll().stream().map(CenarioModel-> new CenarioResponseDTO(CenarioModel.getNome(),CenarioModel.getTipo(),CenarioModel.getTempo(),CenarioModel.getTrilhaSonora())).toList();
    }

    public CenarioModel saveCenario(CenarioRequestDTO cenarioDTO){
        if(repository.findByNome(cenarioDTO.getNome()).isPresent()){
            throw new RuntimeException("Cenário já cadastrado");
        }
        CenarioModel newCenario = new CenarioModel();
        newCenario.setNome(cenarioDTO.getNome());
        newCenario.setTipo(cenarioDTO.getTipo());
        newCenario.setTempo(cenarioDTO.getTempo());
        newCenario.setTrilhaSonora(cenarioDTO.getTrilhaSonora());

        return repository.save(newCenario);
    }
    public CenarioModel atualizar(Long id, CenarioRequestDTO cenarioDTO){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Cenário não encontrado ❌");
        }
        CenarioModel newCenario = repository.findById(id).get();
        newCenario.setNome(cenarioDTO.getNome());
        newCenario.setTipo(cenarioDTO.getTipo());
        newCenario.setTempo(cenarioDTO.getTempo());
        newCenario.setTrilhaSonora(cenarioDTO.getTrilhaSonora());

        return repository.save(newCenario);
    }

    public void delCenario(Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Cenário não encontrado ❌");
        }
        repository.deleteById(id);
    }
}
