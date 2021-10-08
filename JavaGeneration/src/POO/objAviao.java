package POO;

public class objAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aviao aviao1 = new Aviao();
		aviao1.setNome("k-77756");
		aviao1.setCor("Branco");
		aviao1.setModelo("Junkers F13");
		aviao1.setValor(110000);
		aviao1.setQuantBancos(2);
		aviao1.setQuantFuncionarios(1);
		
		Aviao aviao2 = new Aviao();
		aviao2.setNome("tj-5592");
		aviao2.setCor("Branco e preto");
		aviao2.setModelo("Sikorsky Ilya Muromets");
		aviao2.setValor(117000);
		aviao2.setQuantBancos(16);
		aviao2.setQuantFuncionarios(4);
		
		System.out.println("O nome do avião é: ");
		System.out.println(aviao1.getNome());
		System.out.println("A cor do avião é: ");
		System.out.println(aviao1.getCor());
		System.out.println("O modelo do avião é: ");
		System.out.println(aviao1.getModelo());
		System.out.println("O valor do avião é: ");
		System.out.println(aviao1.getValor());
		System.out.println("A quantidade de bancos do avião é: ");
		System.out.println(aviao1.getQuantBancos());
		System.out.println("A quantidade de funcionários do avião é: ");
		System.out.println(aviao1.getQuantFuncionarios());
		
		System.out.println("************************************************");
		
		System.out.println("O nome do avião é: ");
		System.out.println(aviao2.getNome());
		System.out.println("A cor do avião é: ");
		System.out.println(aviao2.getCor());
		System.out.println("O modelo do avião é: ");
		System.out.println(aviao2.getModelo());
		System.out.println("O valor do avião é: ");
		System.out.println(aviao2.getValor());
		System.out.println("A quantidade de bancos do avião é: ");
		System.out.println(aviao2.getQuantBancos());
		System.out.println("A quantidade de funcionários do avião é: ");
		System.out.println(aviao2.getQuantFuncionarios());
		

	}

}
