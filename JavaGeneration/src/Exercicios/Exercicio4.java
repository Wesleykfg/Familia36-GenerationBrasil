package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a, b, c;
		double D=0, S=0, R=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva o Valor de A: ");
		a = leia.nextInt();
		System.out.println("\nEscreva o Valor de B: ");
		b = leia.nextInt();
		System.out.println("\nEscreva o Valor de C: ");
		c = leia.nextInt();
		
		R=Math.pow((a+b), 2);
		S=Math.pow((b+c), 2);
		
		D=(R+S)/2;
		
		System.out.println("\nO valor das contas realizadas: " +D);
		

	}

}
