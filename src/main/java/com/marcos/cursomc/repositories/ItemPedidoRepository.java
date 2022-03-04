package com.marcos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursomc.domain.ItemPedido;

//camada de acesso a dados
@Repository  
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
