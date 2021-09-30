programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()
	{
		real peso, excesso, multa

		escreva("\nPor gentileza, informe o o peso de tomates que está levando: ")
		leia(peso)
		
		limpa()
		se (peso>50.00)
		{
			excesso=(peso-50.00)
			multa=(excesso*4.00)
			escreva("\nCom o peso informado, nota-se um excesso de peso de: ",mat.arredondar(excesso, 2),". Portanto, a multa devida é de: R$",mat.arredondar(multa, 2))
		}
		senao
		{
			escreva("\nDe acordo com o peso indicado, não há excesso de peso, logo, não há multa!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 101; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */