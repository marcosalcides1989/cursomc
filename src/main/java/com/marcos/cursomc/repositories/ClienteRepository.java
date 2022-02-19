package com.marcos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursomc.domain.Categoria;
import com.marcos.cursomc.domain.Cliente;

//camada de acesso a dados
@Repository  
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
