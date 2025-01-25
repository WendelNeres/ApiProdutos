package com.github.wendel.produtosapi.domain.services;


import com.github.wendel.produtosapi.api.dto.ProdutoCreateDTO;
import com.github.wendel.produtosapi.api.dto.ProdutoDTO;
import com.github.wendel.produtosapi.domain.entities.Categoria;
import com.github.wendel.produtosapi.domain.entities.Produto;
import com.github.wendel.produtosapi.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {
    @Autowired
    ProdutosRepository produtosRepository;


    public ProdutoDTO save(ProdutoCreateDTO produtoCreateDTO) {
        return new ProdutoDTO(produtosRepository.save(new Produto(produtoCreateDTO)));
    }

    public List<ProdutoDTO> findAll(){
        return produtosRepository.findAll()
                .stream()
                .map(ProdutoDTO :: new)
                .collect(Collectors.toList());
    }

    public List<ProdutoDTO> findProdutoByCategoria_Nome(String nomeCategoria){
        String categoria = nomeCategoria;



        return null;

    }
}
