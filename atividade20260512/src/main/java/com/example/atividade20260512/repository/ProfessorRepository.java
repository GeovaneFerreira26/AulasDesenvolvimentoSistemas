package com.example.atividade20260512.repository;

import com.example.atividade20260512.model.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long> {

    Optional<ProfessorModel> findByEmail(String email);
}
