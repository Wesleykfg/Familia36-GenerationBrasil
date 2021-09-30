programa
{
	
	funcao inicio()
	{
		inteiro numeros[2][3], somanumero=0, linha, coluna
		real medianumero

		para(linha=0;linha<2;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEtre com um número: ")
				leia(numeros[linha][coluna])
				somanumero += numeros[linha][coluna]
			}
		}
		medianumero = somanumero / 6
		//escreva(numeros[0][0])
		escreva("\nMédia dos números: ",medianumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = 18, 20, 6, 7, 13, 14;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */