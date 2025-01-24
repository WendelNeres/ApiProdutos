package com.github.wendel.produtosapi.domain.entities;

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
    private String descricao;
    @Column(nullable = false)
    private Double preco;
}
