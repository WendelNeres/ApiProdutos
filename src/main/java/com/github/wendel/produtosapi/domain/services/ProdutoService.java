package com.github.wendel.produtosapi.domain.services;


import com.github.wendel.produtosapi.api.dto.ProdutoCreateDTO;
import com.github.wendel.produtosapi.api.dto.ProdutoDTO;
import com.github.wendel.produtosapi.domain.entities.Produto;
import com.github.wendel.produtosapi.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    ProdutosRepository produtosRepository;


    public ProdutoDTO save(ProdutoCreateDTO produtoCreateDTO) {
        return new ProdutoDTO(produtosRepository.save(new Produto(produtoCreateDTO)));
    }
}
