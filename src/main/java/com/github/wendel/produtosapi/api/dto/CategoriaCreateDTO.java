package com.github.wendel.produtosapi.api.dto;

import com.github.wendel.produtosapi.domain.entities.Categoria;

public class CategoriaCreateDTO {
    String nome;

    public CategoriaCreateDTO(){

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
