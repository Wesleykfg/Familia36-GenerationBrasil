package POO;

import java.util.Scanner;

public class objProdutoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
		
		ProdutoEletronico zenfone = new ProdutoEletronico();
		zenfone.setNome("Zenfone 5Z");
		zenfone.setCor("Vermelho");
		zenfone.setModelo("5 Z");
		zenfone.setEstoque(1000);
		zenfone.setValor(2500);
		
		ProdutoEletronico tv = new ProdutoEletronico();
		tv.setNome("Wesss'TV 42");
		tv.setCor("Preto");
		tv.setModelo("SAMSUNG N32");
		tv.setEstoque(32);
		tv.setValor(6500);
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("\n******************************"
						+"\n********************************"
						+"\n*******SEJA BEM VINDI***********"
						+"\n********************************"
						+"  \n******************************");
		
		System.out.println("Você está na Wesss's Store, O que gostaria de verificar?: "
				          +"\n1 - Zenfone 5Z"
				          +"\n2 - TV 42 Polegadas");
		op = leia.nextInt();
		
		switch (op)
		{
		case 1:
			System.out.println("\nCelular: ");
			System.out.println(zenfone.getNome());
			System.out.println("\nModelo: ");
			System.out.println(zenfone.getModelo());
			System.out.println("\nCor: ");
			System.out.println(zenfone.getCor());
			System.out.println("\nEm estoque: ");
			System.out.println(zenfone.getEstoque());
			System.out.println("\nValor: ");
			System.out.println(zenfone.getValor());
		
			break;
			
		case 2:
			System.out.println("\\nTV: ");
			System.out.println(tv.getNome());
			System.out.println("\nModelo: ");
			System.out.println(tv.getModelo());
			System.out.println("\nCor: ");
			System.out.println(tv.getCor());
			System.out.println("\nEm estoque: ");
			System.out.println(tv.getEstoque());
			System.out.println("\nValor: ");
			System.out.println(tv.getValor());
	
			break;
		}
		
	}

}
