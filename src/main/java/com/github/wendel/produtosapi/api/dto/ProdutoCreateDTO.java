package com.github.wendel.produtosapi.api.dto;


import lombok.Data;


@Data

public class ProdutoCreateDTO {
    String nome;
    String descricao;
    Double preco;
}
