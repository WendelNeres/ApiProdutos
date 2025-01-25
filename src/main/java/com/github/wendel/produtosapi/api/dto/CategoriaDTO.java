package com.github.wendel.produtosapi.api.dto;

import com.github.wendel.produtosapi.domain.entities.Categoria;

public class CategoriaDTO {

    long id;
    String nome;

    public CategoriaDTO() {
    }



    public CategoriaDTO(Categoria categoria){
        this.id = categoria.getId();
        this.nome = categoria.getNome();
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
