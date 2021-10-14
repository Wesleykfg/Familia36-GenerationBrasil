package POOHERANCA;

public class Preguica extends Animal{
	private String deveCorrer;
	private String pelos;
	private int quantGarras;
	private String condFisico;
	private String movimentacao;
	
	public Preguica (String nome, int idade, int quantPatas, String periculosidade,
			String alimentacao, String deveCorrer, String pelos, int quantGarras, String condFisico, String movimentacao)
	{
		super (nome, idade, quantPatas, periculosidade, alimentacao);
		this.deveCorrer = deveCorrer;
		this.pelos = pelos;
		this.quantGarras = quantGarras;
		this.condFisico = condFisico;
		this.movimentacao = movimentacao;

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

	public int getQuantGarras() {
		return quantGarras;
	}

	public void setQuantGarras(int quantGarras) {
		this.quantGarras = quantGarras;
	}

	public String getCondFisico() {
		return condFisico;
	}

	public void setCondFisico(String condFisico) {
		this.condFisico = condFisico;
	}

	public String getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(String movimentacao) {
		this.movimentacao = movimentacao;
	}
	@Override
	public String emitirSom()
	{
		return "Nyan...";
	}
	
	
}