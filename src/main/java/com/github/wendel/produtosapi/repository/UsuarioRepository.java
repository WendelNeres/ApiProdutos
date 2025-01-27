package com.github.wendel.produtosapi.repository;

import com.github.wendel.produtosapi.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUserName(String userName);
    void deleteByUserName(String userName);


}
