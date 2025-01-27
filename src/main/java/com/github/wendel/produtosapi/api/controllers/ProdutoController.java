package com.github.wendel.produtosapi.api.controllers;


import com.github.wendel.produtosapi.api.dto.ProdutoCreateDTO;
import com.github.wendel.produtosapi.api.dto.ProdutoDTO;
import com.github.wendel.produtosapi.domain.entities.Categoria;
import com.github.wendel.produtosapi.domain.services.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@AllArgsConstructor
public class ProdutoController {
    @Autowired
    private final ProdutoService service;



    @PostMapping
    public ResponseEntity<ProdutoDTO>save(@RequestBody ProdutoCreateDTO produtoCreateDTO){
        return new ResponseEntity<ProdutoDTO>(service.save(produtoCreateDTO), HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll (){
       return new ResponseEntity<List<ProdutoDTO>> (service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{categoria}")
    public ResponseEntity<List<ProdutoDTO>> findProdutoByCategoriaNome(@PathVariable String categoria){
        return new ResponseEntity<List<ProdutoDTO>>(service.findProdutoByCategoria_Nome(categoria), HttpStatus.OK);
    }





}
