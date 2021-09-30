programa
{
	
	funcao inicio()
	{
		inteiro matr[3][3], somanumero=0, linha, coluna, somadig=0

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEtre com um número: ")
				leia(matr[linha][coluna])
				somanumero += matr[linha][coluna]
				somadig = matr[0][0]+matr[1][1]+matr[2][2]
			}
		}
		escreva("\nA soma dos numeros informados é de: ",somanumero)
		escreva("\nA soma da diagonal principal é de: ",somadig)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matr, 6, 10, 4}-{somanumero, 6, 22, 10}-{linha, 6, 36, 5}-{coluna, 6, 43, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */