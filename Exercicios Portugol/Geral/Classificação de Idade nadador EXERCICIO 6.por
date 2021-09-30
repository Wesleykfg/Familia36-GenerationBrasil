programa
{
	
	funcao inicio()
	{
		inteiro idade
		cadeia nome

		escreva("\nPor gentileza, informe o nome do nadador: ")
		leia(nome)
		limpa()

		escreva("\nPor gentileza, informe a idade o nadador: ")
		leia(idade)
		limpa()

		se (idade>=5 e idade<=7)
		{
			escreva("\nO nadador ",nome," se encontra na categoria Infantil A.")
		}
		senao se (idade>=8 e idade<=11)
		{
			escreva("\nO nadador ",nome," se encontra na categoria Infantil B.")
		}
		senao se (idade>=12 e idade<=13)
		{
			escreva("\nO nadador ",nome," se encontra na categoria Juvenil A.")
		}
		senao se (idade>=14 e idade<=17)
		{
			escreva("\nO nadador ",nome," se encontra na categoria Juvenil B.")
		}
		senao se (idade>=5 e idade<=7)
		{
			escreva("\nO nadador ",nome," não está categorizado pois sua idade não permite a participação no campeonato.")
		}
		senao
		{
			escreva("\nO nadador ",nome," se encontra na categoria Adultos.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 883; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */