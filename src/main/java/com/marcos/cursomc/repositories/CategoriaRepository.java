package com.marcos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursomc.domain.Categoria;

//camada de acesso a dados
@Repository  
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
