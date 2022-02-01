package com.marcos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursomc.domain.Produto;

//camada de acesso a dados
@Repository  
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
