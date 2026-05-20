package com.example.atividade20260519.repository;

import com.example.atividade20260519.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long> {
    Optional<EnderecoModel>findByCep(String cep);
}
