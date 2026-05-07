package com.example.ativ20260505.repository;

import com.example.ativ20260505.model.JogadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorModel, Long> {

    Optional<JogadorModel> findByEmail(String email);
}
