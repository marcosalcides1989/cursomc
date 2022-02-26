package com.marcos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursomc.domain.Estado;

//camada de acesso a dados
@Repository  
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
