package com.github.wendel.produtosapi.api.controllers;


import com.github.wendel.produtosapi.api.dto.ProdutoCreateDTO;
import com.github.wendel.produtosapi.api.dto.ProdutoDTO;
import com.github.wendel.produtosapi.domain.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    ProdutoService service;

    @PostMapping
    public ResponseEntity<ProdutoDTO>save(@RequestBody ProdutoCreateDTO produtoCreateDTO){
        return new ResponseEntity<ProdutoDTO>(service.save(produtoCreateDTO), HttpStatus.CREATED);
    }


}
