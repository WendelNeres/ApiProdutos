package com.github.wendel.produtosapi.domain.entities;


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

  @OneToMany(mappedBy = "produto")
  private List<Produto> produto;



  public Categoria(){

  }

  public Categoria(Long id, String nome, List<Produto> produto) {
    this.id = id;
    this.nome = nome;
    this.produto = produto;
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

  public List<Produto> getProduto() {
    return produto;
  }

  public void setProduto(List<Produto> produto) {
    this.produto = produto;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Categoria categoria)) return false;
    return Objects.equals(getId(), categoria.getId()) && Objects.equals(getNome(), categoria.getNome()) && Objects.equals(getProduto(), categoria.getProduto());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getNome(), getProduto());
  }
}
