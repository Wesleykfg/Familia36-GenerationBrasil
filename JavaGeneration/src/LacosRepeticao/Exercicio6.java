package LacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		int x, cont=0;
		float media, soma=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nPor gentileza, digite um n�mero: ");
		x = leia.nextInt();
		do
		{
			if(x==0)
			{
				System.out.println("\nVoc� digitou 0, portanto sair� do programa!!!");
			}
			else
			{
			
			if(x%3==0)
			{
				soma+=x;
				cont++;
			}
			System.out.println("\nPor gentileza, digite um n�mero: ");
			x = leia.nextInt();
			}
		}
		while(x!=0);
		if(cont==0)
		{
			System.out.println("\nN�o � poss�vel fazer divis�o por zero!!!");
		}
		else
		{
		media=soma/cont;
		
		System.out.println("\nA m�dia dos n�meros m�ltiplos de 3 �: "+media);
		}
	}

}
