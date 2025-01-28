package com.github.wendel.produtosapi.domain.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.wendel.produtosapi.api.dto.CategoriaCreateDTO;
import com.github.wendel.produtosapi.api.dto.CategoriaDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Objects;




@Entity
@Table(name = "tb_categoria")
@Getter
@Setter
public class Categoria {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false, unique = true)
  private String nome;
  @OneToMany(mappedBy = "categoria")
  @JsonIgnore
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
