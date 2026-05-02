package com.example.ativsecurity.repository;

import com.example.ativsecurity.model.ExercicioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExercicioRepository extends JpaRepository<ExercicioModel, Long> {

    Optional<ExercicioModel> findByNome(String nome);
}
