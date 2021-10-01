package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String nome;
		int diaN, mesN, anoN, idade, calculoAno, calculoMes;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		nome = leia.next();
		
		System.out.println("Insira seu DIA de nascimento");
		diaN = leia.nextInt();
		System.out.println("Insira seu MES de nascimento");
		mesN = leia.nextInt();
		System.out.println("Insira seu ANO de nascimento");
		anoN = leia.nextInt();
		
		calculoAno = anoN*365;
		calculoMes= mesN*30;
		idade = calculoAno+calculoMes+diaN;
		
		System.out.println("Ola "+ nome+ " você viveu "+ idade+ " dias ");
		
		
		
		
		
		

	}

}
