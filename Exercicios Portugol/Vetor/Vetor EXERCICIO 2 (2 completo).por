programa
{
	
	funcao inicio()
	{
		inteiro vet[10], somavet=0, maior=0, x, contmaior = 0
		real media

		para (x=0;x<10;x++)
		{
			escreva("\nPor gentileza, informe o lançamento: ")
			leia(vet[x])
			
			enquanto(vet[x]<1 ou vet[x]>6)
			{
				escreva("\nPor gentileza, informe novamente o lançamento entre 1 a 6 (números de um dado): ")
				leia(vet[x])
			}
			somavet += vet[x]

			se(maior<vet[x])
			{
				maior = vet[x]
			}
		}
		
		escreva("\nO maior valor que informado foi: ",maior)
		
		para (x=0;x<10;x++)
		{
			se(vet[x] == maior)
			{
				contmaior++ // mesma coisa que contmaior = contmaior + 1
			}
		}

		media = somavet / 10
		escreva("\nA média de lançamentos é de: ",media)
		escreva("\nA quantidade de lançamentos do maior valor é de: ",contmaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 686; 
 * @PONTOS-DE-PARADA = 6, 7, 11;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */