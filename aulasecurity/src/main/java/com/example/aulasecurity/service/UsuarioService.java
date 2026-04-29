package com.example.aulasecurity.service;

import com.example.aulasecurity.dto.UsuarioRequestDTO;
import com.example.aulasecurity.dto.UsuarioResponseDTO;
import com.example.aulasecurity.model.UsuarioModel;
import com.example.aulasecurity.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(usuario -> new UsuarioResponseDTO(usuario.getNome(), usuario.getEmail()))
                .toList();
    }


    public UsuarioModel salvarUser(UsuarioRequestDTO usuarioDTO){
        if(repository.findByEmail(usuarioDTO.getEmail()).isPresent()){
            throw new RuntimeException("Usuário já cadastrado. ❌");
        }
        UsuarioModel novoUsuario = new UsuarioModel();
        novoUsuario.setNome(usuarioDTO.getNome());
        novoUsuario.setEmail(usuarioDTO.getEmail());
        novoUsuario.setSenha(passwordEncoder.encode(usuarioDTO.getSenha()));

        return repository.save(novoUsuario);

    }

}
