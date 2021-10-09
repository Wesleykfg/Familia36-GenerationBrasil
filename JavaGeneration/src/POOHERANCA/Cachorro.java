package POOHERANCA;

public class Cachorro extends Animal{
	private String deveCorrer;
	private String pelos;
	private String castrado;
	private String raca;
	
	public Cachorro (String nome, int idade, String emitirSom, int quantPatas, String periculosidade,
			String alimentacao, String deveCorrer, String pelos, String castrado, String raca)
	{
		super (nome, idade, emitirSom, quantPatas, periculosidade, alimentacao);
		this.deveCorrer = deveCorrer;
		this.pelos = pelos;
		this.castrado = castrado;
		this.raca = raca;

	}

	public String getDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

	public String getPelos() {
		return pelos;
	}

	public void setPelos(String pelos) {
		this.pelos = pelos;
	}

	public String getCastrado() {
		return castrado;
	}

	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}
