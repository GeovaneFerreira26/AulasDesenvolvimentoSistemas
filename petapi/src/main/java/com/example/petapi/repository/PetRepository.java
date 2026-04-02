package com.example.petapi.repository;

import com.example.petapi.model.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<PetModel, Long> {

}
