programa
{
	
	funcao inicio()
	{
		inteiro numero, somapar=0, somaimpar=0

		escreva("\nEntre com um numero: ")
		leia(numero)

		enquanto(numero!=0) //!= sinal de diferença, para o enquanto manter acontecendo caso sejadigitado outro numero diferente de zero ou do que nos definirmos.
		{
			se(numero % 2 ==0)
			{
				somapar = somapar + numero //somapar += numero
			}
			senao
			{
				somaimpar = somaimpar + numero
			}
			escreva("\nEntre com um numero: ")
			leia(numero)
		}
		escreva("\nSomatório dos numeros pares: ",somapar)
		escreva("\nSomatório dos numeros ímpares: ",somaimpar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 78; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */