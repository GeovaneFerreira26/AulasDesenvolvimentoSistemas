package com.example.ativ20260505.service;

import com.example.ativ20260505.dto.PersonagemRequestDTO;
import com.example.ativ20260505.dto.PersonagemResponseDTO;
import com.example.ativ20260505.model.PersonagemModel;
import com.example.ativ20260505.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {
    @Autowired
    private PersonagemRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<PersonagemResponseDTO> listarTodos(){
        return (List<PersonagemResponseDTO>) repository.findAll().stream().map(personagemModel -> new PersonagemResponseDTO(personagemModel.getNome(), personagemModel.getLife(), personagemModel.getPoder(), personagemModel.getPoderEspecial())).toList();
    }

    public PersonagemModel salvarPers(PersonagemRequestDTO personDTO){
        if (repository.findByNome(personDTO.getNome()).isPresent()){
            throw new RuntimeException("Personagem já cadastrado");
        }
        PersonagemModel newPerson = new PersonagemModel();
        newPerson.setNome(personDTO.getNome());
        newPerson.setPoder(personDTO.getPoder());
        newPerson.setLife(personDTO.getLife());
        newPerson.setPoderEspecial(personDTO.getPoderEspecial());

        return repository.save(newPerson);
    }

    public PersonagemModel updatePerson(Long id, PersonagemRequestDTO personDTO){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Personagem não encontrado ❌");
        }
        PersonagemModel newPerson = repository.findById(id).get();
        newPerson.setNome(personDTO.getNome());
        newPerson.setPoder(personDTO.getPoder());
        newPerson.setLife(personDTO.getLife());
        newPerson.setPoderEspecial(personDTO.getPoderEspecial());

        return repository.save(newPerson);

    }

    public void deletarPerson(Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Personsagem não encontrado ❌");
        }
        repository.deleteById(id);
    }
}
