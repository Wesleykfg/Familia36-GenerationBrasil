package ExercicioLacodeDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1,val2, val3, maiorVal;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\nEntre com a primeiro valor: ");
		val1 = ler.nextInt();
		System.out.println("\nEntre com a segundo valor: ");
		val2 = ler.nextInt();
		System.out.println("\nEntre com a terceiro valor: ");
		val3 = ler.nextInt();
		
		if (val1>val2 && val1>val3)
		{
			maiorVal = val1;
		}
		else if (val2>val1 && val2>val3)
		{
			maiorVal = val2;
		}
		else
		{
			maiorVal = val3;
		}
		System.out.printf("\nO maior valor informado foi o de: %d",maiorVal);

	}

}
