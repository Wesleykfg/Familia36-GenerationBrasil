package ExercicioLacodeDecisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1, val2, val3;
		
Scanner ler = new Scanner (System.in);
		
		System.out.println("\nEntre com a primeiro valor: ");
		val1 = ler.nextInt();
		System.out.println("\nEntre com a segundo valor: ");
		val2 = ler.nextInt();
		System.out.println("\nEntre com a terceiro valor: ");
		val3 = ler.nextInt();
		
		if (val1>val2 && val1>val3 && val2<val1 && val2>val3 && val3<val1 && val3<val2)
		{
			System.out.printf("\nO valores informados de forma crescente é de %d",val1);
			System.out.printf("\nO valores informados de forma crescente é de %d",val2);
			System.out.printf("\nO valores informados de forma crescente é de %d",val3);
		}
		else if (val1>val2 && val1>val3 && val3<val1 && val3>val2 && val2<val1 && val2<val3)
		{
			System.out.printf("\nO valores informados de forma crescente é de %d",val1);
			System.out.printf("\nO valores informados de forma crescente é de %d",val3);
			System.out.printf("\nO valores informados de forma crescente é de %d",val2);
		}
		else if (val2>val1 && val2>val3 && val1<val2 && val1>val3 && val3<val1 && val3<val2)
		{
			System.out.printf("\nO valores informados de forma crescente é de %d",val2);
			System.out.printf("\nO valores informados de forma crescente é de %d",val1);
			System.out.printf("\nO valores informados de forma crescente é de %d",val3);
		}
		else if (val2>val1 && val2>val3 && val1<val3 && val1<val2 && val3>val1 && val3<val2)
		{
			System.out.printf("\nO valores informados de forma crescente é de %d",val2);
			System.out.printf("\nO valores informados de forma crescente é de %d",val3);
			System.out.printf("\nO valores informados de forma crescente é de %d",val1);
		}
		else if (val3>val1 && val3>val2 && val1<val3 && val1>val2 && val2<val1 && val2<val3)
		{
			System.out.printf("\nO valores informados de forma crescente é de %d",val3);
			System.out.printf("\nO valores informados de forma crescente é de %d",val1);
			System.out.printf("\nO valores informados de forma crescente é de %d",val2);
		}
		
		else
		{
			System.out.printf("\nO valores informados de forma crescente é de %d",val3);
			System.out.printf("\nO valores informados de forma crescente é de %d",val2);
			System.out.printf("\nO valores informados de forma crescente é de %d",val1);
		}

	}

}
