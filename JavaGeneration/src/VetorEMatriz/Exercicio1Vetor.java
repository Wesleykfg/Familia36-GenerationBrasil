package VetorEMatriz;

public class Exercicio1Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 0, 5, -2, -5, 7};
		int somaVal=0;
		
		A[3] = 100;
		
		for(int x=0;x<6;x++)
		{
			System.out.println("Os valores são "+A[x]);
		}
		somaVal = A[0]+A[1]+A[5];
		System.out.printf("\nA soma das celulas A0, A1 e A5 é de: %d",somaVal);

	}

}
