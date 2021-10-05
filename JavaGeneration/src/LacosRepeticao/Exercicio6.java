package LacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		int x, cont=0;
		float media, soma=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nPor gentileza, digite um número: ");
		x = leia.nextInt();
		do
		{
			if(x==0)
			{
				System.out.println("\nVocê digitou 0, portanto sairá do programa!!!");
			}
			else
			{
			
			if(x%3==0)
			{
				soma+=x;
				cont++;
			}
			System.out.println("\nPor gentileza, digite um número: ");
			x = leia.nextInt();
			}
		}
		while(x!=0);
		if(cont==0)
		{
			System.out.println("\nNão é possível fazer divisão por zero!!!");
		}
		else
		{
		media=soma/cont;
		
		System.out.println("\nA média dos números múltiplos de 3 é: "+media);
		}
	}

}
