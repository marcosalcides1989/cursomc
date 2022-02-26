package com.marcos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursomc.domain.Pedido;

//camada de acesso a dados
@Repository  
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
