package br.org.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojadegames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	//Buscar valor maior que o digitado em lista crescente
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	//Buscar valor menor que o digitado em lista decrescente
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
}
