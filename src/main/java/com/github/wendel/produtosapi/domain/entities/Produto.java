package com.github.wendel.produtosapi.domain.entities;
import com.github.wendel.produtosapi.api.dto.ProdutoCreateDTO;
import com.github.wendel.produtosapi.api.dto.ProdutoDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Objects;





@Entity
@Table(name = "tb_produtos")
@Getter
@Setter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Double preco;
    @Column(nullable = false, unique = true)
    private String urlImagem;

    @ManyToOne()
    @JoinColumn(name = "categoria_nome", referencedColumnName = "nome", nullable = false)
    private Categoria categoria;



    public Produto(){

    }

    public Produto(Long id, String nome, String descricao, Double preco, String urlImagem, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.urlImagem = urlImagem;
        this.categoria = categoria;
    }

    public Produto(ProdutoDTO produtoDTO){
        this.id = produtoDTO.getId();
        this.nome = produtoDTO.getNome();
        this.preco = produtoDTO.getPreco();
        this.descricao = produtoDTO.getDescricao();
        this.urlImagem = produtoDTO.getUrlImagem();
        this.categoria = produtoDTO.getCategoria();
    }


    public Produto(ProdutoCreateDTO produtoCreateDTO, Categoria categoria){
        setNome(produtoCreateDTO.getNome());
        setDescricao(produtoCreateDTO.getDescricao());
        setPreco(produtoCreateDTO.getPreco());
        setUrlImagem(produtoCreateDTO.getUrlImagem());
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(getId(), produto.getId()) && Objects.equals(getNome(), produto.getNome()) && Objects.equals(getDescricao(), produto.getDescricao()) && Objects.equals(getPreco(), produto.getPreco()) && Objects.equals(getUrlImagem(), produto.getUrlImagem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getDescricao(), getPreco(), getUrlImagem());
    }
}
