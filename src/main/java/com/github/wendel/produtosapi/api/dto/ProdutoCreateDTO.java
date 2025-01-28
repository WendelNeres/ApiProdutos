package com.github.wendel.produtosapi.api.dto;


import com.github.wendel.produtosapi.domain.entities.Categoria;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.java.BlobJavaType;


@Setter
@Getter
public class ProdutoCreateDTO {
    String nome;
    String descricao;
    Double preco;
    String urlImagem;
    String   categoria;


    public ProdutoCreateDTO(){

    }

}
