package com.github.wendel.produtosapi.api.dto;


import com.github.wendel.produtosapi.domain.entities.Categoria;
import lombok.Data;
import org.hibernate.type.descriptor.java.BlobJavaType;


public class ProdutoCreateDTO {
    String nome;
    String descricao;
    Double preco;
    String urlImagem;
    String   categoria;


    public ProdutoCreateDTO(){

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
