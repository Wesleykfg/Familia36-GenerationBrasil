package VetorEMatriz;

import java.util.Scanner;

public class Exercicio4Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float matrizA[][] = new float[2][2]; float matrizB[][] = new float[2][2]; float matrizC[][] = new float[2][2];
		int constante = 0, linha, coluna, op = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nPor gentileza, informe os valores desejados para primeira Matriz: ");
				matrizA[linha][coluna] = leia.nextFloat();
				System.out.println("\nPor gentileza, informe os valores desejados para segunda Matriz: ");
				matrizB[linha][coluna] = leia.nextFloat();
			}
		}
		System.out.println("\nPor gentileza, escolha a opção desejada para suas matrizes: "
				+"\n1 - Somar as matrizes digitadas;"
				+"\n2 - Subtrair a primeira matriz da segunda;"
				+"\n3 - Adicionar uma constante aos valores de suas matrizes;"
				+"\n4 - Mostrar as matrizes digitadas.");
		
		op = leia.nextInt();
		switch(op)
		{
		case 1:
		{
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matrizC[linha][coluna] = matrizA[linha][coluna]+matrizB[linha][coluna];
					System.out.printf("[%d]",matrizC[linha][coluna]);
				}
			}
			System.out.println();
		}
		break;
		
		case 2:
		{
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matrizC[linha][coluna] = matrizB[linha][coluna]- matrizA[linha][coluna];
					System.out.printf("[%d]",matrizC[linha][coluna]);
				}
			}
			System.out.println();
		}
		break;
		
		case 3:
		{
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					matrizB[linha][coluna] = matrizB[linha][coluna] + constante;
					matrizB[linha][coluna] = matrizB[linha][coluna] + constante;
				}
			}
			System.out.printf("\nO valor da constante é de: %d", constante);
			System.out.println("\nDigite o numero de constante desejado: ");
			constante = leia.nextInt();
			System.out.println("\nO resultado da primeira matriz com a adição da constante é de: ");
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					System.out.printf("[%d]",matrizA[linha][coluna]);
				}
				System.out.println();
			}
			
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					System.out.printf("[%d]",matrizB[linha][coluna]);
				}
				System.out.println();
			}
		}
		break;
		
		case 4:
		{
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					System.out.printf("\nSegue as matrizes digitadas: ");
					System.out.printf("[%d]",matrizA[linha][coluna]);
					System.out.printf("[%d]",matrizB[linha][coluna]);
				}
				System.out.println();
			}
		}
	}

	}
}