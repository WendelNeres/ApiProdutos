package com.github.wendel.produtosapi.api.dto;

import com.github.wendel.produtosapi.domain.entities.Categoria;
import com.github.wendel.produtosapi.domain.entities.Produto;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Setter
@Getter
public class ProdutoDTO {
    private long id;
    private String nome;
    private String descricao;
    private Double preco;
    private String urlImagem;
    private Categoria  categoria;


    public ProdutoDTO(){

    }

    public ProdutoDTO(Produto produto){
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.preco = produto.getPreco();
        this.urlImagem = produto.getUrlImagem();
        this.categoria = produto.getCategoria();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProdutoDTO that)) return false;
        return getId() == that.getId() && Objects.equals(getNome(), that.getNome()) && Objects.equals(getDescricao(), that.getDescricao()) && Objects.equals(getPreco(), that.getPreco()) && Objects.equals(getUrlImagem(), that.getUrlImagem()) && Objects.equals(getCategoria(), that.getCategoria());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getDescricao(), getPreco(), getUrlImagem(), getCategoria());
    }
}
