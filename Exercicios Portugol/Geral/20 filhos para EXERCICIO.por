programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real salario = 0.00, mediasalario = 0.00, mediafilho = 0.00, maiorsalario = 0.00, pessate100 = 0.00, totalsal = 0.00, totalfilhos = 0.00, totalp100 = 0.00, pessoasate100 = 0.00
		inteiro filhos = 0, habits = 20


		para (inteiro x=1; x<=habits; x++)
		{
			escreva("\nPor gentileza, informe o salario: ")
			leia(salario)

			escreva("\nPor gentileza, infome o numero de filhos: ")
			leia(filhos)

			totalsal = totalsal + salario
			totalfilhos = totalfilhos + filhos
			se (salario > maiorsalario)
			{
				maiorsalario = salario
			}
			se (salario<=100)
			{
				totalp100++
			}
		}
		mediasalario = totalsal / habits
		mediafilho = totalfilhos / habits
		pessoasate100 = (totalp100 / habits)*100

		escreva("\nMedia Salarial: R$", mat.arredondar(mediasalario, 2), "\nMedia de filhos: ", mat.arredondar(mediafilho, 2))
		escreva("\nMaior salario informado: R$",mat.arredondar(maiorsalario, 2))
		escreva("\nO percentual de pessoas com o salario ate R$ 100,00 é  de: ",mat.arredondar(pessoasate100, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */