programa
{
	
	funcao inicio()
	{
		real numero1,numero2,resultado=0.0
		inteiro op

		escreva("\nEntre com o primeiro número: ")
		leia(numero1)

		escreva("\nEntre com o segundo número: ")
		leia(numero2)

		escreva("\n\t\tOpções da calculadora")//\t\t É igual ao tab do teclado
		escreva("\n1-Soma\n2-Diferença\n3-Multiplocação\n4-Divisão")
		escreva("\nDigite sua opção: ")
		leia(op)

		escolha(op)
		{
			caso 1:
			resultado = numero1 + numero2
			pare
			caso 2:
			resultado = numero1 - numero2
			pare
			caso 3:
			resultado = numero1 * numero2
			pare
			caso 4:
			se(numero2 == 0)
			{
				escreva("\nNão podemos fazer divisão por ZERO!!!")
			}
			senao
			{
			resultado = numero1 / numero2
			}
			pare
			caso contrario://excessão, caso não seja nenhum dos casos a cima
			escreva("\nOpção Invalida!!!")
			
		}

		escreva("\nResultado da operação: ",resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */