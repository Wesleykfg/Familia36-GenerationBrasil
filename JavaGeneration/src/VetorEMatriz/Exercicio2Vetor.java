package VetorEMatriz;

import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int [6];
		int x, quantImpar = 0;
		float somaPar = 0; 
		Scanner leia = new Scanner (System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nPor gentileza, informe um numero");
			num[x] = leia.nextInt();
		}
		System.out.println("\nOs n�meros pares digitados foram: ");
		for(x=0;x<6;x++)
		{
			if(num[x]%2==0)
			{
				somaPar = somaPar + num[x];
				System.out.println(" "+num[x]);
			}
		}
		System.out.println("\nOs n�meros impares digitados foram: ");
		for(x=0;x<6;x++)
		{
			if(num[x]%2!=0)
			{
				quantImpar++;
				System.out.println(" "+num[x]);
			}
		}
		
		System.out.printf("\nA soma dos n�meros pares digitados � de: %f",somaPar);
		System.out.printf("\nA quantidade de n�meros impares digitados � de: %d",quantImpar);

	}

}
