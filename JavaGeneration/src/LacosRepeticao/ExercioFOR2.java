package LacosRepeticao;

import java.util.Scanner;

public class ExercioFOR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int num, x = 0, par1, imp1, somPar = 0, somImp = 0;
		
		for(x=1; x<=10; x++)
		{
			System.out.println("\nInfome o numero desejado: ");
			num = leia.nextInt();
			
			if(num % 2 ==0)
			{
				somPar++;
			}
			else
			{
				somImp++;
			}
			
		}
		System.out.printf("\nDe acordo com o informado, a quantidade de numeros par são: %d",somPar);
		System.out.printf("\nDe acordo com o informado, a quantidade de numeros Impar são: %d",somImp);
	}

}
