package com.example.ativ20260505.service;

import com.example.ativ20260505.dto.JogadorRequestDTO;
import com.example.ativ20260505.dto.JogadorResponseDTO;
import com.example.ativ20260505.model.JogadorModel;
import com.example.ativ20260505.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {
    @Autowired
    private JogadorRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<JogadorResponseDTO> listarTodos(){
        return (List<JogadorResponseDTO>) repository.findAll().stream().map(JogadorModel -> new JogadorResponseDTO(JogadorModel.getNome(),JogadorModel.getIdade(), JogadorModel.getSexo(),JogadorModel.getEmail())).toList();
    }

    public JogadorModel salvarJogador(JogadorRequestDTO playerDTO){
        if (repository.findByEmail(playerDTO.getEmail()).isPresent()){
            throw  new RuntimeException("Jogador já cadastrado ❌");
        }
        JogadorModel newJogador = new JogadorModel();
        newJogador.setNome(playerDTO.getNome());
        newJogador.setIdade(playerDTO.getIdade());
        newJogador.setSexo(playerDTO.getSexo());
        newJogador.setEmail(playerDTO.getEmail());

        return repository.save(newJogador);
    }

    public JogadorModel atualizar (Long id, JogadorRequestDTO jogadorDTO){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Jogador não encontrado ❌");
        }
        JogadorModel novoJogador = repository.findById(id).get();
        novoJogador.setNome(jogadorDTO.getNome());
        novoJogador.setIdade(jogadorDTO.getIdade());
        novoJogador.setSexo(jogadorDTO.getSexo());
        novoJogador.setEmail(jogadorDTO.getEmail());

        return repository.save(novoJogador);
    }

    public void deletarJogdor(Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Jogador não localizado ❌");
        }
        repository.deleteById(id);
    }
}
