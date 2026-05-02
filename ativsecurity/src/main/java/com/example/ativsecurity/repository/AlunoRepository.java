package com.example.ativsecurity.repository;


import com.example.ativsecurity.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {

    Optional<AlunoModel> findByEmail(String email);
}
