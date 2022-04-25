package com.marcos.cursomc.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.marcos.cursomc.domain.enums.EstadoPagamento;

@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	private Integer numerodeparcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numerodeparcelas) {
		super(id, estado, pedido);
		this.numerodeparcelas = numerodeparcelas;
		
	}

	public Integer getNumerodeparcelas() {
		return numerodeparcelas;
	}

	public void setNumerodeparcelas(Integer numerodeparcelas) {
		this.numerodeparcelas = numerodeparcelas;
	}
	
	
}
