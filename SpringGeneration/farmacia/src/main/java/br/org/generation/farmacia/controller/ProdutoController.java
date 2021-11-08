package br.org.generation.farmacia.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.farmacia.model.Produto;
import br.org.generation.farmacia.repository.ProdutoRepository;

@RestController	
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll()
	{
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable long id)
	{
		return produtoRepository.findById(id)
			.map(resposta-> ResponseEntity.ok(resposta))
			.orElse(ResponseEntity.notFound().build());
	}
	
	/*@GetMapping("/if_else/{id}")
	public ResponseEntity<Optional<Produto>> getByIdIfElse(@PathVariable long id)
	{
		Optional <Produto> busca = produtoRepository.findById(id);
		
		if (busca.isPresent()) {
			return ResponseEntity.ok(busca);
		}else {
			return ResponseEntity.notFound().build());
		}
	}*/
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> getByNome(@PathVariable String nome)
	{
		return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(nome));
	}	
	
	@PostMapping
	public ResponseEntity<Produto> postProduto(@Valid @RequestBody Produto produto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> putProduto(@Valid @RequestBody Produto produto) 
	{
			return produtoRepository.findById(produto.getId())
				.map(resposta -> ResponseEntity.ok().body(produtoRepository.save(produto)))
				.orElse(ResponseEntity.notFound().build());

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProduto(@PathVariable long id) 
	{
		return produtoRepository.findById(id)
				.map(resposta -> {
					produtoRepository.deleteById(id);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				})
				.orElse(ResponseEntity.notFound().build());
	}

	
	
	// Consulta pelo preço maior do que o preço digitado emm ordem crescente
	
	@GetMapping("/preco_maior/{preco}")
	public ResponseEntity<List<Produto>> getPrecoMaiorQue(@PathVariable BigDecimal preco){ 
		return ResponseEntity.ok(produtoRepository.findByPrecoGreaterThanOrderByPreco(preco));
	}
			
	// Consulta pelo preço menor do que o preço digitado em ordem decrescente
			
	@GetMapping("/preco_menor/{preco}")
	public ResponseEntity<List<Produto>> getPrecoMenorQue(@PathVariable BigDecimal preco){ 
		return ResponseEntity.ok(produtoRepository.findByPrecoLessThanOrderByPrecoDesc(preco));
	}
			
	// Consulta por nome e laboratório
			
	@GetMapping("/nome/{nome}/elaboratorio/{laboratorio}")
	public ResponseEntity<List<Produto>> getByNomeELaboratorio(@PathVariable String nome, @PathVariable String laboratorio){
		return ResponseEntity.ok(produtoRepository.findByNomeAndLaboratorio(nome, laboratorio));
	}
			
	// Consulta por preço entre dois valores (Between)
			
	@GetMapping("/preco_inicial/{inicio}/preco_final/{fim}")
	public ResponseEntity<List<Produto>> getByPrecoEntre(@PathVariable BigDecimal inicio, @PathVariable BigDecimal fim){
		return ResponseEntity.ok(produtoRepository.buscarProdutosEntre(inicio, fim));
	}
	
	// Consulta por Boolean Positivo
	@GetMapping("/entrega_true")
	public ResponseEntity<List<Produto>> getByEntregaTrue(){
		return ResponseEntity.ok(produtoRepository.findByEntregaTrue());
	}
	
	// Consulta por Boolean Negativo
	@GetMapping("/entrega_false")
	public ResponseEntity<List<Produto>> getByEntregaFalse(){
		return ResponseEntity.ok(produtoRepository.findByEntregaFalse());
	}

}
