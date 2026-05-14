package com.example.atividade20260512.repository;

import com.example.atividade20260512.model.CursosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CursosRepository extends JpaRepository<CursosModel, Long> {

    Optional<CursosModel> findByCurso (String cursos);
}
