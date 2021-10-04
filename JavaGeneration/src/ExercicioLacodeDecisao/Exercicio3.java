package ExercicioLacodeDecisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\nInforme a idade desejada: ");
		idade = ler.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("\nDe acordo com a idade informada, você se encontra na categoria infantil!!!");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("\nDe acordo com a idade informada, você se encontra na categoria juvenil!!!");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("\nDe acordo com a idade informada, você se encontra na categoria adulto!!!");
		}
		else
		{
			System.out.println("\nVocê informou uma idade invalida...");
		}

	}

}