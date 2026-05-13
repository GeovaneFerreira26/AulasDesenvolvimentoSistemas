package com.example.atividade20260512.repository;

import com.example.atividade20260512.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel,Long> {
    Optional<AlunoModel> findByEmail(String email);
}
