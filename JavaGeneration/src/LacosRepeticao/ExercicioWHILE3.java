package LacosRepeticao;

import java.util.Scanner;

public class ExercicioWHILE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int idade, totalMenos21=0, totalMais50=0;
		
		System.out.printf("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade!= -99)
		{
			if(idade<21)
			{
				totalMenos21++;
			}
			else if(idade>50)
			{
				totalMais50++;
			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = leia.nextInt();
		}
		System.out.printf("\nO total de pessoas menores de 21 anos é de: %d", totalMenos21);
		System.out.printf("\nO total de pessoas maiores de 50 anos é de: %d", totalMais50);

	}

}
