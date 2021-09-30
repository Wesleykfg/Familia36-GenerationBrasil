programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos, segundo
		cadeia nome


		escreva(" Digite seu nome")
		leia(nome)
		
		escreva("Olá usuario, informe os segundos desejados")
		leia(segundo)

		horas=(segundo/3600)
		minutos=((segundo%3600)/60)
		segundos=((segundo%3600)%60)

		escreva("\nO evento durou ",horas, " horas ",minutos, " minutos e ",segundos,  " segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */