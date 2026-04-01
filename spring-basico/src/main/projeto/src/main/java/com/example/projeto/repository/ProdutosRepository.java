package com.example.projeto.repository;


import com.example.projeto.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutoModel, Long> {
}
