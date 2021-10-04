package ExercicioLacodeDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		double x, y;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\nInforme o número desejado: ");
		numero = ler.nextInt();
		
		if(numero % 2 ==0)
		{
			x = Math.sqrt(numero);
			System.out.println("O numero informado é par, segue a raiz quadrada do mesmo: "+ x);
		}
		else
		{
			y = Math.pow(numero, 2);
			System.out.println("O numero informado é impar, segue o mesmo elevado ao quadrado: "+ y);
		}

	}

}
