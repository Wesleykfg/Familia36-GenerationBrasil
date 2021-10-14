package Excecao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int op, resposta, quantEstoque = 0;
		String nome = null;
		ArrayList<String> estoque = new ArrayList();
		
		
		nome = JOptionPane.showInputDialog("Qual � o seu nome?");
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome � " + nome +
		 "?");
		if (resposta == JOptionPane.YES_OPTION) {
		// verifica se o usu�rio clicou no bot�o YES
		JOptionPane.showMessageDialog(null, "Seu nome � " + nome);
		} else {
		JOptionPane.showMessageDialog(null, "Seu nome n�o � " + nome);
		
	}
		do
		{
		System.out.println("\n\t\t\t\t******************************"
				+"\n\t\t\t\t********************************"
				+"\n\t\t\t\t*******SEJA BEM VINDI***********"
				+"\n\t\t\t\t********************************"
				+"  \n\t\t\t\t******************************");
		System.out.println("          _______  _______  _______  _______  _  _______    _______  _______  _        _______  ______   _______  _______ \r\n"
				+ "|\\     /|(  ____ \\(  ____ \\(  ____ \\(  ____ \\( )(  ____ \\  (  ____ \\(  ___  )( \\      (  ___  )(  __  \\ (  ___  )(  ____ \\\r\n"
				+ "| )   ( || (    \\/| (    \\/| (    \\/| (    \\/|/ | (    \\/  | (    \\/| (   ) || (      | (   ) || (  \\  )| (   ) || (    \\/\r\n"
				+ "| | _ | || (__    | (_____ | (_____ | (_____    | (_____   | |      | (___) || |      | (___) || |   ) || |   | || (_____ \r\n"
				+ "| |( )| ||  __)   (_____  )(_____  )(_____  )   (_____  )  | |      |  ___  || |      |  ___  || |   | || |   | |(_____  )\r\n"
				+ "| || || || (            ) |      ) |      ) |         ) |  | |      | (   ) || |      | (   ) || |   ) || |   | |      ) |\r\n"
				+ "| () () || (____/\\/\\____) |/\\____) |/\\____) |   /\\____) |  | (____/\\| )   ( || (____/\\| )   ( || (__/  )| (___) |/\\____) |\r\n"
				+ "(_______)(_______/\\_______)\\_______)\\_______)   \\_______)  (_______/|/     \\|(_______/|/     \\|(______/ (_______)\\_______)\r\n"
				+ "                                                                                                                          ");
		

		System.out.println("\nSeja bem vindi ao Wesss's Cal�ados System, a sua loja de cal�ados preferida: "
				+"\nEstimado colaborador "+nome+", qual op��o deseja utilizar no momento? "
				+"\n1) Deseja adicionar algum cal�ado ao estoque?"
				+"\n2) Deseja remover algum cal�ado do estoque?"
				+"\n3) Deseja atualizar os cal�ados em estoque?"
				+"\n4) Deseja apresentar todos os cal�ados em estoque?"
				+"\n5) Deseja ver a quantidade de pares em estoque?"
				+"\n6) Deseja Sair do Programa?");
		op = leia.nextInt();
		
		switch (op)
		{
		case 1:
			leia.nextLine();
			System.out.println("\nPor gentileza, informe o cal�ado que deseja adicionar ao estoque: ");
			String calcado = leia.nextLine();
			estoque.add(calcado);
			quantEstoque++;
			System.out.println("\nParab�ns, o produto: "+calcado+" foi adicinado ao estoque!!!");
			break;
			
		case 2:
			leia.nextLine();
			System.out.println("\nPor gentileza, informe o cal�ado que deseja remover do estoque: ");
			String calcado2 = leia.nextLine();
			if (estoque.contains(calcado2))
			{
				estoque.remove(calcado2);
				System.out.println("\nParab�ns, o produto: "+calcado2+" foi removido do estoque!!!");
			}
			else
			{
				System.out.println("\nO produto informado n�o existe em estoque, necess�rio realizar uma nova encomenda!!!");
			}
			break;
		case 3:
		{
			leia.nextLine();
			System.out.println("\nPor gentileza, informe o cal�ado que deseja atualizar: ");
			String verificar = leia.nextLine();
			System.out.println("\nPor gentileza, informe o cal�ado que deseja colocar no lugar do: "+verificar);
			String novo = leia.nextLine();
			if (estoque.contains(verificar))
			{
				estoque.remove(verificar);
				estoque.add(novo);
				System.out.println("Parab�ns, o cal�ado: "+verificar+" foi substituido pelo: "+novo);
			}
			else
			{
				System.out.println("\nAten��o, cal�ado n�o existente em estoque!!!");
			}
		}
		break;
		case 4:
		{
			System.out.println("Os cal�ados em estoque s�o: ");
			System.out.println(estoque);
		}
		break;
		case 5:
		{
			System.out.println("A quantidade de cal�ados em estoque s�o: ");
			System.out.println(quantEstoque);
		}
		
		default:
			System.out.println("Aten��o, a op��o digitada � inv�lida!!!");
		
		}
	}
		while (op!=6);

	}

}
