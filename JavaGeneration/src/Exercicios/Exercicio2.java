package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String nome;
		int dias, mes, ano, dia;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\ninforme seu nome: ");
		nome = leia.next();
		
		System.out.println("\nOl� usuario, informe a sua idade em dias sem usar qualquer pontua��o: ");
		dias = leia.nextInt();
		
		ano=(dias/365);
		mes=((dias%365)/30);
		dia=((dias%365)%30);
		
		System.out.println("\nVoc� tem "+ano+" anos "+mes+" meses e "+dia+ " dias de vida");
		

	}

}
