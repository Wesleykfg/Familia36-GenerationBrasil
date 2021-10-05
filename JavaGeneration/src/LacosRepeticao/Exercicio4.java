package LacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, gen = 0, psi = 0, calmas = 0, mulNervs = 0, homAgress = 0, outCalm = 0, mais40Nervs = 0, menos18Calms = 0, x = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Por gentileza, informe sua idade.");
		idade = leia.nextInt();
		
		System.out.println("Por gentileza, informe seu genero: 1 - Masculino, 2 - Feminino, 3 - Outros");
		gen = leia.nextInt();
		
		while (gen<1 || gen>3)
		{
			System.out.println("\nAtenção, você digitou uma opção invalida, tente novamente...");
			System.out.println("Por gentileza, informe seu genero: 1 - Masculino, 2 - Feminino, 3 - Outros");
			gen = leia.nextInt();
		}
		
		System.out.println("Por gentileza, informe o traço que você mais se identifica diante os que serão apresentados:"
				+"1- Calmo(a) ou Calme, 2 - Nervoso(a) ou Nervose, 3 - Agressivo(a) ou Agressive");
		psi = leia.nextInt();
		
		while (gen<1 || gen>3)
		{
			System.out.println("\nAtenção, você digitou uma opção invalida, tente novamente...");
			System.out.println("Por gentileza, informe o traço que você mais se identifica diante os que serão apresentados:"
					+"1- Calmo(a) ou Calme, 2 - Nervoso(a) ou Nervose, 3 - Agressivo(a) ou Agressive");
			psi = leia.nextInt();
		}
		
		
		while(x != 150)
		{
			if (psi == 1)
			{
				calmas++;
			}
			
			if (gen == 2 && psi == 2)
			{
				mulNervs++;
			}
			
			if (gen == 1 && psi == 3)
			{
				homAgress++;
			}
			
			if (gen == 3 && psi == 1)
			{
				outCalm++;
			}
			if (idade > 40 && psi == 2)
			{
				mais40Nervs++;
			}
			if (idade < 18 && psi == 1)
			{
				menos18Calms++;
			}

			System.out.println("Por gentileza, informe sua idade.");
			idade = leia.nextInt();
			
			System.out.println("Por gentileza, informe seu genero: 1 - Masculino, 2 - Feminino, 3 - Outros");
			gen = leia.nextInt();
			
			while (gen<1 || gen>3)
			{
				System.out.println("\nAtenção, você digitou uma opção invalida, tente novamente...");
				System.out.println("Por gentileza, informe seu genero: 1 - Masculino, 2 - Feminino, 3 - Outros");
				gen = leia.nextInt();
			}
			
			System.out.println("Por gentileza, informe o traço que você mais se identifica diante os que serão apresentados:"
					+"1- Calmo(a) ou Calme, 2 - Nervoso(a) ou Nervose, 3 - Agressivo(a) ou Agressive");
			psi = leia.nextInt();
			
			while (gen<1 || gen>3)
			{
				System.out.println("\nAtenção, você digitou uma opção invalida, tente novamente...");
				System.out.println("Por gentileza, informe o traço que você mais se identifica diante os que serão apresentados:"
						+"1- Calmo(a) ou Calme, 2 - Nervoso(a) ou Nervose, 3 - Agressivo(a) ou Agressive");
				psi = leia.nextInt();
			}
			x++;
		}
		System.out.println("O numero de pessoas calmas é de: "+ calmas);
		System.out.println("O numero de mulheres nervosas é de: "+ mulNervs);
		System.out.println("O numero de homens agressivos é de: "+ homAgress);
		System.out.println("O numero de outros calmes é de: "+ outCalm);
		System.out.println("O numero de pessoas nervosas com mais de 40 anos é de: "+ mais40Nervs);
		System.out.println("O numero de pessoas calmas com menos de 18 anos é de: "+ menos18Calms);
		
	}

}
