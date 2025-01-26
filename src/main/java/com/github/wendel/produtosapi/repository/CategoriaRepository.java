package com.github.wendel.produtosapi.repository;

import com.github.wendel.produtosapi.domain.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {


    Categoria findByNome(String nome);
}
