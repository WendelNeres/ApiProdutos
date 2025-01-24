package com.github.wendel.produtosapi.api.dto;

import com.github.wendel.produtosapi.domain.entities.Produto;
import lombok.Data;

@Data

public class ProdutoDTO {
    long id;
    String nome;
    String descricao;
    Double preco;

    public ProdutoDTO(Produto produto){
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.preco = produto.getPreco();
    }
}
