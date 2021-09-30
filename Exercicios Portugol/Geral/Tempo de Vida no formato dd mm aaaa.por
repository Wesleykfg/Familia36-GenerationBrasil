programa
{
	
	funcao inicio()
	{
		inteiro dias, mes, ano, dia
		cadeia nome


		escreva(" Digite seu nome")
		leia(nome)
		
		escreva("Olá usuario, informe a sua idade em dias sem usar qualquer pontuação")
		leia(dias)

		ano=(dias/365)
		mes=((dias%365)/30)
		dia=((dias%365)%30)

		escreva("\nVocê tem ",ano, " anos ",mes, " meses e ",dia,  " dias de vida")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */