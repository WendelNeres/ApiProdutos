package com.github.wendel.produtosapi.api.dto;

import com.github.wendel.produtosapi.domain.entities.Categoria;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class CategoriaDTO {

    private long id;
    private String nome;

    public CategoriaDTO() {
    }



    public CategoriaDTO(Categoria categoria){
        this.id = categoria.getId();
        this.nome = categoria.getNome();
    }

}
