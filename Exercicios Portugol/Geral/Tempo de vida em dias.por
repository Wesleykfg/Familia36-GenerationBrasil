programa
{
	
	funcao inicio()
	{
		inteiro diaA, mesA, anoA, diaN, mesN, anoN, dias = 0
		cadeia nome

		diaA = 23
		mesA = 09
		anoA = 2021

	
		escreva(" Digite seu nome")
		leia(nome)

		escreva("Insira a sua data de nascimento seguindo o formado 00 00 0000 - DIA/MES/ANO")
		leia(diaN,mesN,anoN)

		enquanto(anoN < anoA ou mesN < mesA ou diaN < diaA){
			dias++
			diaN++
			se(diaN > 30){
				diaN = 1
				mesN++
				se(mesN > 12){
					anoN++
					mesN = 1
					
				}
			}

		
		}
		escreva("\nOla ", nome, " você viveu ", dias, " dias ")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 148; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */