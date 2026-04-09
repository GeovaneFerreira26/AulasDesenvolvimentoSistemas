package com.example.projeto20260408.repository;


import com.example.projeto20260408.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    //Consultar no banco de dados se o e-mail já existe,
    // antes de salvar um cliente.
    Optional<FuncionarioModel> findByMatricula(String matricula);
}
