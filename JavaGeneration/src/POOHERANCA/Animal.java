package POOHERANCA;

public class Animal {
	private String nome;
	private int idade;
	private String emitirSom;
	private int quantdePatas;
	private String periculosidade;
	private String alimentacao;
	
	public Animal (String nome, int idade, String emitirSom, int quantPatas, String periculosidade, String alimentacao)
	{
		this.nome = nome;
		this.idade = idade;
		this.emitirSom = emitirSom;
		this.quantdePatas = quantPatas;
		this.periculosidade = periculosidade;
		this.alimentacao = alimentacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public int getQuantdePatas() {
		return quantdePatas;
	}

	public void setQuantdePatas(int quantdePatas) {
		this.quantdePatas = quantdePatas;
	}

	public String getPericulosidade() {
		return periculosidade;
	}

	public void setPericulosidade(String periculosidade) {
		this.periculosidade = periculosidade;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	

}
