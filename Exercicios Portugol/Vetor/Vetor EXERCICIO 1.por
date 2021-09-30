programa
{
	
	funcao inicio()
	{
		inteiro vet[5], x, maiorval = 0

		para (x=0;x<5;x++)
		{
			escreva("\nPor gentileza, informe um numero: ")
			leia(vet[x])

			se (vet[x]>maiorval)
			{
				maiorval=vet[x]
			}
					
		}
		para (x=0;x<5;x++)
			{
				escreva("\nOs valores informados foram: ",vet[x])
			}

			escreva("\nO maior valor informado foi: ",maiorval)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */