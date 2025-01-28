package com.github.wendel.produtosapi.api.dto.Usuario;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioCreateDTO {
    String email;
    String userName;
    String senha;
    String nivelDeAcesso;

    public UsuarioCreateDTO(){

    }



}
