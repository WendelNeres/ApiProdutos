package com.github.wendel.produtosapi.domain.entities;


import com.github.wendel.produtosapi.api.dto.CategoriaCreateDTO;
import com.github.wendel.produtosapi.api.dto.CategoriaDTO;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "tb_categoria")
public class Categoria {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false, unique = true)
  private String nome;

  @OneToMany(mappedBy = "categoria")
  private List<Produto> produto;



  public Categoria(){

  }

  public Categoria(String nome) {
    this.nome = nome;
  }

  public Categoria(CategoriaCreateDTO categoriaCreateDTO){
    this.nome = categoriaCreateDTO.getNome();
  }

  public Categoria(CategoriaDTO categoriaDTO){
    this.id = categoriaDTO.getId();
    this.nome = categoriaDTO.getNome();
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Categoria categoria)) return false;
    return Objects.equals(getId(), categoria.getId()) && Objects.equals(getNome(), categoria.getNome());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getNome());
  }
}
