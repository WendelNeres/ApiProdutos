package com.github.wendel.produtosapi.api.dto.Usuario;


import com.github.wendel.produtosapi.domain.entities.Usuario;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioDTO {
    private long id;
    private String email;
    private String userName;
    private String senha;
    private String nivelDeAcesso;

    public UsuarioDTO(){

    }

    public UsuarioDTO(Usuario usuario){
        this.id = usuario.getId();
        this.email = usuario.getEmail();
        this.userName = usuario.getUserName();
        this.senha = usuario.getSenha();
        this.nivelDeAcesso = usuario.getNivelDeAcesso();
    }



}
