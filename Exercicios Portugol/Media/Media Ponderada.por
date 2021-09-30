programa
{
	
	funcao inicio()
	{	
		cadeia nome
		inteiro idade, peso1 = 2, peso2 = 3, peso3 = 5
		real n1,n2,n3, media
		
		escreva("\nEntre com o nome do aluno")
		leia(nome)

		escreva("\nEntre com a idade do aluno")
		leia(idade)

		escreva("\nEntre a primeira nota do aluno")
		leia(n1)

		escreva("\nEntre a segunda nota do aluno")
		leia(n2)

		escreva("\nEntre a terceira nota do aluno")
		leia(n3)
		

		media= ((n1*peso1)+(n2*peso2)+(n3*peso3)) / (peso1+peso2+peso3)

		escreva("\nnome: ",nome,"\nidade: ",idade, "\nnota 1: ",n1,"\nnota 2:",n2,"\nnota 3: ",n3,"\nA media do aluno(a) foi: ",media)



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */