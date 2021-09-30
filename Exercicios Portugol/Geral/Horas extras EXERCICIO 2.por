programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real codigo, numero, numeroex, extra

		escreva("\nPor gentileza, informe o código do funcionario desejado: ")
		leia(codigo)
		limpa()

		escreva("\nPor gentileza funcionario ", codigo," informe a quantidade de horas trabalhadas: ")
		leia(numero)
		limpa()

		se (numero>50.00)
		{
			numeroex=(numero-50.00)
			extra=(numeroex*20.00)
			escreva("\nSegundo as horas informadas, esse funcionário trabalhou: ",mat.arredondar(numeroex, 2)," horas extras.Sendo assim, deve ser pago: R$",mat.arredondar(extra, 2)," ao mesmo.")
		}
		senao
		escreva("\nSegundo as horas informadas, não há horas extras, logo, o mesmo deve receber o salario sem alterações.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */