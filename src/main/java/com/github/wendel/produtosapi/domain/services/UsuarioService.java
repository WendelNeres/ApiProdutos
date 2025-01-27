package com.github.wendel.produtosapi.domain.services;

import com.github.wendel.produtosapi.api.Exceptions.UserNotFoundException;
import com.github.wendel.produtosapi.api.dto.Usuario.UsuarioCreateDTO;
import com.github.wendel.produtosapi.api.dto.Usuario.UsuarioDTO;
import com.github.wendel.produtosapi.domain.entities.Usuario;
import com.github.wendel.produtosapi.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@Service
@Transactional
@AllArgsConstructor
public class UsuarioService {
    @Autowired
    private final UsuarioRepository usuarioRepository;

    public UsuarioDTO save(UsuarioCreateDTO usuarioCreateDTO){
        return new UsuarioDTO(usuarioRepository.save(new Usuario(usuarioCreateDTO)));
    }

    public UsuarioDTO findByUserName(String userName){
        Usuario usuario = usuarioRepository.findByUserName(userName);
        if(usuario != null){
            return new UsuarioDTO(usuario);
        }else throw new UserNotFoundException("Usuario não encontrado");
    }

    public UsuarioDTO updateUsuario(UsuarioCreateDTO usuarioCreateDTO, String userName){
        Usuario usuario = usuarioRepository.findByUserName(userName);

        if (usuario != null){
            return new UsuarioDTO(usuarioRepository.save(new Usuario(usuarioCreateDTO)));
        }else throw new UserNotFoundException("Usuario não encontrado");
    }

    public UsuarioDTO updateParcialUsuario(UsuarioCreateDTO usuarioCreateDTO, String username){
        Usuario usuario = usuarioRepository.findByUserName(username);
        if(usuario != null) {
            if (usuarioCreateDTO.getEmail() != null) {
                usuario.setEmail(usuarioCreateDTO.getEmail());
            }
            if (usuarioCreateDTO.getSenha() != null) {
                usuario.setEmail(usuarioCreateDTO.getSenha());
            }
            if (usuarioCreateDTO.getNivelDeAcesso() != null) {
                usuario.setNivelDeAcesso(usuarioCreateDTO.getNivelDeAcesso());
            }
            return new UsuarioDTO(usuarioRepository.save(usuario));
        }else throw new UserNotFoundException("Usuario não encontrado");
    }

    public void delete(String userName){
        if(usuarioRepository.findByUserName(userName) != null) {
                usuarioRepository.deleteByUserName(userName);
        }else throw new UserNotFoundException("Usuario não encontrado");
    }



}
