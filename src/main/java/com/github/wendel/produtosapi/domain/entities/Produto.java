package com.github.wendel.produtosapi.domain.entities;

import com.github.wendel.produtosapi.api.dto.ProdutoCreateDTO;
import com.github.wendel.produtosapi.api.dto.ProdutoDTO;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Double preco;

    public Produto(){

    }

    public Produto(ProdutoDTO produtoDTO){
        this.id = produtoDTO.getId();
        this.nome = produtoDTO.getNome();
        this.preco = produtoDTO.getPreco();
    }

    public Produto(ProdutoCreateDTO produtoCreateDTO){
        this.nome= produtoCreateDTO.getNome();
        this.descricao = produtoCreateDTO.getDescricao();
        this.preco  = produtoCreateDTO.getPreco();
    }
}
