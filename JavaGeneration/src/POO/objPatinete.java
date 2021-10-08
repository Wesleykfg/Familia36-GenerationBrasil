package POO;

import java.util.Scanner;

public class objPatinete {

	public static void main(String[] args) {
		String modeloo;
		String corr;
		
		Scanner leia = new Scanner(System.in);
		
		Patinete pat = new Patinete();
		pat.setValor(250);
		pat.setModelo("K-2020");
		
		System.out.println("\nBem vindo a Pat Feliz!!!"
						+"\nInfome a cor desejada do seu Patinete: ");
		corr = leia.next();
		pat.setCor(corr);
		
		System.out.println("\nSegundo as informações armazenadas, o Patinete desejado e: ");
		System.out.println("Modelo: ");
		System.out.println(pat.getModelo());
		System.out.println("Cor: ");
		System.out.println(pat.getCor());
		System.out.println("Valor: ");
		System.out.println(pat.getValor());
		
		

	}

}
