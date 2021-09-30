programa
{
	
	funcao inicio()
	{
		real num1, num2, num3, num4, numm1, numm2, numm3, numm4

		escreva("\nInforme O primeiro numero desejado para a operação: ")
		leia(num1)
		
		escreva("\nInforme O segundo numero desejado para a operação: ")
		leia(num2)

		escreva("\nInforme O terceiro numero desejado para a operação: ")
		leia(num3)

		escreva("\nInforme O quarto numero desejado para a operação: ")
		leia(num4)

		numm1=(num1*num1)
		numm2=(num2*num2)
		numm3=(num3*num3)
		numm4=(num4*num4)
		limpa()

		se (num3>=1000)
		{
			escreva("\nSegundo o valor informado no terceiro quadrante, o calculo ultrapassou o valor de 1000, sendo assim, o resultado foi: ",numm1)
		}
		senao
		{
			escreva("\nSegundo os valores informados, segue os calculos: O primeiro numero informado foi: ",num1,
			"\nO resultado da conta foi: ",numm1,
			"\nO segundo numero informado foi: ",num2,
			"\nO resultado da conta foi: ",numm2,
			"\nO terceiro numero informado foi: ",num3,
			"\nO resultado da conta foi: ",numm3,
			"\nO quarto numero informado foi: ",num4,
			"\nO resultado da conta foi: ",numm4)
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */