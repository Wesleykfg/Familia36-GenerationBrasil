programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("\nPor gentileza, entre com o numero desejado: ")
		leia(numero)
		escreva(numero," , ")

		enquanto (numero<=100)
		{
			numero = numero * 3 // mesma coisa que numero *= 3
			escreva("\nSegundo o numero informado, segue o resultado das multiplicações: ",numero)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */