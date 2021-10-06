package VetorEMatriz;

import java.util.Scanner;

public class Exercicio3Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[][] = new int[3][3];
		int quantMais10 = 0, linha, coluna;
		
		Scanner leia = new Scanner (System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nPor gentileza, informe os valores desejados: ");
				numeros[linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.println("\nOs números maiores de 10 digitados foram: ");
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				if(numeros[linha][coluna]>10)
				{
					quantMais10++;
					System.out.println(" "+numeros[linha][coluna]);
				}
			}
		}
		System.out.printf("\nA quantidade de numeros maiores que 10 Digitados foi de: %d",quantMais10);

	}

}
