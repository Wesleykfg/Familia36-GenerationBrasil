package POOHERANCA;

public class Cavalo extends Animal{
	private String deveCorrer;
	private String pelos;
	private String cruzou;
	private int velocidade;
	
	public Cavalo (String nome, int idade, int quantPatas, String periculosidade,
			String alimentacao, String deveCorrer, String pelos,String cruzou, int velocidade)
	{
		super (nome, idade, quantPatas, periculosidade, alimentacao);
		this.deveCorrer = deveCorrer;
		this.pelos = pelos;
		this.cruzou = cruzou;
		this.velocidade = velocidade;

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

	public String getCruzou() {
		return cruzou;
	}

	public void setCruzou(String cruzou) {
		this.cruzou = cruzou;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	@Override
	public String emitirSom()
	{
		return "Hiin in in";
	}
	



}