package com.github.wendel.produtosapi.domain.services;


import com.github.wendel.produtosapi.api.dto.CategoriaCreateDTO;
import com.github.wendel.produtosapi.api.dto.CategoriaDTO;
import com.github.wendel.produtosapi.domain.entities.Categoria;
import com.github.wendel.produtosapi.repository.CategoriaRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Transactional
    public CategoriaDTO save(CategoriaCreateDTO categoriaCreateDTO){
        return new CategoriaDTO(categoriaRepository.save(new Categoria(categoriaCreateDTO)));
    }



}
