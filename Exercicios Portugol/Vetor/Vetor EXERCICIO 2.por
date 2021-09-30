programa
{
	
	funcao inicio()
	{
		inteiro vet[10], x, media, somatotal = 0, quantidade = 0

		para (x=0;x<10;x++)
		{
			escreva("\nPor gentileza, informe um numero: ")
			leia(vet[x])
			somatotal+=vet[x]
		}
		
		para (x=0;x<10;x++)
			{
				escreva("\nOs valores informados foram: ",vet[x])

				se (vet[x]==6)
				{
					quantidade++
				}
			}

			media=(somatotal/10)
			escreva("\nA media dos valores informados é de: ",media)
			escreva("\nA quantidade informada do maior valor foi de: ",quantidade)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */