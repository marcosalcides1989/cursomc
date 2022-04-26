package com.marcos.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcos.cursomc.domain.Categoria;
import com.marcos.cursomc.domain.Cidade;
import com.marcos.cursomc.domain.Cliente;
import com.marcos.cursomc.domain.Endereco;
import com.marcos.cursomc.domain.Estado;
import com.marcos.cursomc.domain.ItemPedido;
import com.marcos.cursomc.domain.Pagamento;
import com.marcos.cursomc.domain.PagamentoComBoleto;
import com.marcos.cursomc.domain.PagamentoComCartao;
import com.marcos.cursomc.domain.Pedido;
import com.marcos.cursomc.domain.Produto;
import com.marcos.cursomc.domain.enums.EstadoPagamento;
import com.marcos.cursomc.domain.enums.TipoCliente;
import com.marcos.cursomc.repositories.CategoriaRepository;
import com.marcos.cursomc.repositories.CidadeRepository;
import com.marcos.cursomc.repositories.ClienteRepository;
import com.marcos.cursomc.repositories.EnderecoRepository;
import com.marcos.cursomc.repositories.EstadoRepository;
import com.marcos.cursomc.repositories.ItemPedidoRepository;
import com.marcos.cursomc.repositories.PagamentoRepository;
import com.marcos.cursomc.repositories.PedidoRepository;
import com.marcos.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
