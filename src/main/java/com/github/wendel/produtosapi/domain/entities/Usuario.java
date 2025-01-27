package com.github.wendel.produtosapi.domain.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_usuarios")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String senha;
    @Column(unique = true, nullable = false)
    private String nivelDeAcesso;

    public Usuario(){

    }


}
