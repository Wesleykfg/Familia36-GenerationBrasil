package LacosRepeticao;

import java.util.Scanner;

public class ExercicioDO5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,somaNum = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nPor gentileza, informe um numero: ");
		num = leia.nextInt();
		
		do
		{
			if(num==0)
			{
				System.out.println("\nVoc� digitou 0 e ir� sair do programa!!!");
			}
			else
			{
				somaNum = somaNum + num;
			}
			System.out.println("\nPor gentileza, informe um numero: ");
			num = leia.nextInt();
			
		}while (num!=0);
		System.out.printf("A soma dos n�meros apresentados � de: %d",somaNum);

	}

}
