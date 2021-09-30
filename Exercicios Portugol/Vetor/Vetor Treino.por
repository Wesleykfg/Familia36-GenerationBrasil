programa
{
	
	funcao inicio()
	{
		real media[4], n1, n2, n3, mediageral, somamedia=0.0
		inteiro x

		para(x=0;x<4;x++)
		{
			escreva("\nEntre coma primeira nota: ")
			leia(n1)
			escreva("\nEntre coma segunda nota: ")
			leia(n2)
			escreva("\nEntre coma terceira nota: ")
			leia(n3)

			media[x] = (n1+n2+n3)/3
			escreva ("\nMédia alune: ",media[x])
			somamedia += media[x]
		}
		mediageral = somamedia / 4
		escreva ("\nMédia geral: ",mediageral)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 77; 
 * @PONTOS-DE-PARADA = 16, 18, 19, 6, 22, 7, 23, 11, 12, 13, 14, 15;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */