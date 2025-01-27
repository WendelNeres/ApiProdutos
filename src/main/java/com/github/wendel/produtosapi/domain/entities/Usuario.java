package com.github.wendel.produtosapi.domain.entities;


import com.github.wendel.produtosapi.api.dto.Usuario.UsuarioCreateDTO;
import com.github.wendel.produtosapi.api.dto.Usuario.UsuarioDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_usuarios")
@Getter
@Setter
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String userName;
    @Column(unique = true, nullable = false)
    private String senha;
    @Column(unique = true, nullable = false)
    private String nivelDeAcesso;

    public Usuario(){

    }

    public Usuario(UsuarioDTO usuarioDTO){
        this.id = usuarioDTO.getId();
        this.email = usuarioDTO.getEmail();
        this.userName = usuarioDTO.getUserName();
        this.senha = usuarioDTO.getSenha();
        this.nivelDeAcesso = usuarioDTO.getNivelDeAcesso();
    }

    public Usuario(UsuarioCreateDTO usuarioCreateDTO){
        this.email = usuarioCreateDTO.getEmail();
        this.userName = usuarioCreateDTO.getUserName();
        this.senha = usuarioCreateDTO.getSenha();
        this.nivelDeAcesso = usuarioCreateDTO.getNivelDeAcesso();
    }


}
