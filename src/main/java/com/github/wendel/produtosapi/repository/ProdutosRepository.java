package com.github.wendel.produtosapi.repository;

import com.github.wendel.produtosapi.api.dto.ProdutoDTO;
import com.github.wendel.produtosapi.domain.entities.Categoria;
import com.github.wendel.produtosapi.domain.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutosRepository  extends JpaRepository<Produto, Long> {

List<ProdutoDTO> findProdutoByCategoria_Nome(String nomeCategoria);





}
