programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real nota1,nota2,nota3,media

		escreva("\nEntre com a primeira nota: ")
		leia(nota1)
		
		escreva("\nEntre com a segunda nota: ")
		leia(nota2)

		escreva("\nEntre com a terceira nota: ")
		leia(nota3)

		media = (nota1+nota2+nota3) / 3

		escreva("\nSua média foi de: ",mat.arredondar(media,2))

		se (media>=7.0 e media<=10)//se minha média for maior ou igual a 7 e igual ou menor que 10.
		{
			escreva("\nParabéns, você foi APROVADE!!!")
			
		}
		senao se(media>=5.0 e media<7.0)
		{
			escreva("\nAtenção, você ficou de EXAME!!!")//SE MINHA NOTA FOR MAIOR OU IGUAL A 5 E IGUAL OU MENOR A 7.			
		}
		senao se(media>=0 e media<5.0)
		{
			escreva("\nPutzzz, você foi REPROVADE!!!")
		}
		senao
		{
			escreva("\nMédia fora dos valores aplicados...")
		}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 780; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */