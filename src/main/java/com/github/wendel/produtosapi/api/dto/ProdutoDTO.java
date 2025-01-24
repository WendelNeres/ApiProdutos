package com.github.wendel.produtosapi.api.dto;

import lombok.Data;

@Data
public class ProdutoDTO {
    long id;
    String nome;
    String descricao;
    Double preco;
}
