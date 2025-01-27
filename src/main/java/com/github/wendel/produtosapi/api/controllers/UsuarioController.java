package com.github.wendel.produtosapi.api.controllers;

import com.github.wendel.produtosapi.api.dto.Usuario.UsuarioCreateDTO;
import com.github.wendel.produtosapi.api.dto.Usuario.UsuarioDTO;
import com.github.wendel.produtosapi.domain.services.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDTO> save (@RequestBody UsuarioCreateDTO usuarioCreateDTO){
        return new ResponseEntity<UsuarioDTO>(usuarioService.save(usuarioCreateDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{userName}")
    public ResponseEntity<UsuarioDTO> findByUserName(@PathVariable String userName){
        return new ResponseEntity<UsuarioDTO>(usuarioService.findByUserName(userName), HttpStatus.OK);
    }

    @PutMapping("/{userName}")
    public ResponseEntity<UsuarioDTO> updateUsuario(@RequestBody UsuarioCreateDTO usuarioCreateDTO,@PathVariable String userName){
        return new ResponseEntity<UsuarioDTO>(usuarioService.updateUsuario(usuarioCreateDTO, userName),HttpStatus.OK);
    }

    @PatchMapping("/{userName}")
    public ResponseEntity<UsuarioDTO> updateParcialUsuario(@RequestBody UsuarioCreateDTO usuarioCreateDTO, @PathVariable String userName){
        return new ResponseEntity<UsuarioDTO>(usuarioService.updateParcialUsuario(usuarioCreateDTO,userName), HttpStatus.OK);
    }

    @DeleteMapping("{userName}")
    public void deleteUsuario(@PathVariable String userName){
         usuarioService.delete(userName);
    }



}
