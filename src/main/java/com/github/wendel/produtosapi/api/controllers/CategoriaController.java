package com.github.wendel.produtosapi.api.controllers;

import com.github.wendel.produtosapi.api.dto.CategoriaCreateDTO;
import com.github.wendel.produtosapi.api.dto.CategoriaDTO;
import com.github.wendel.produtosapi.domain.services.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    CategoriaService categoriaService;

    public ResponseEntity<CategoriaDTO> save(@RequestBody CategoriaCreateDTO categoriaCreateDTO){
        return new ResponseEntity<CategoriaDTO>(categoriaService.save(categoriaCreateDTO), HttpStatus.CREATED);
    }
}
