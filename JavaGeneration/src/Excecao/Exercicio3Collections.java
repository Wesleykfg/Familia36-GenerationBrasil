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
		
		
		nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome +
		 "?");
		if (resposta == JOptionPane.YES_OPTION) {
		// verifica se o usuário clicou no botão YES
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
		} else {
		JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);
		
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
		

		System.out.println("\nSeja bem vindi ao Wesss's Calçados System, a sua loja de calçados preferida: "
				+"\nEstimado colaborador "+nome+", qual opção deseja utilizar no momento? "
				+"\n1) Deseja adicionar algum calçado ao estoque?"
				+"\n2) Deseja remover algum calçado do estoque?"
				+"\n3) Deseja atualizar os calçados em estoque?"
				+"\n4) Deseja apresentar todos os calçados em estoque?"
				+"\n5) Deseja ver a quantidade de pares em estoque?"
				+"\n6) Deseja Sair do Programa?");
		op = leia.nextInt();
		
		switch (op)
		{
		case 1:
			leia.nextLine();
			System.out.println("\nPor gentileza, informe o calçado que deseja adicionar ao estoque: ");
			String calcado = leia.nextLine();
			estoque.add(calcado);
			quantEstoque++;
			System.out.println("\nParabéns, o produto: "+calcado+" foi adicinado ao estoque!!!");
			break;
			
		case 2:
			leia.nextLine();
			System.out.println("\nPor gentileza, informe o calçado que deseja remover do estoque: ");
			String calcado2 = leia.nextLine();
			if (estoque.contains(calcado2))
			{
				estoque.remove(calcado2);
				System.out.println("\nParabéns, o produto: "+calcado2+" foi removido do estoque!!!");
			}
			else
			{
				System.out.println("\nO produto informado não existe em estoque, necessário realizar uma nova encomenda!!!");
			}
			break;
		case 3:
		{
			leia.nextLine();
			System.out.println("\nPor gentileza, informe o calçado que deseja atualizar: ");
			String verificar = leia.nextLine();
			System.out.println("\nPor gentileza, informe o calçado que deseja colocar no lugar do: "+verificar);
			String novo = leia.nextLine();
			if (estoque.contains(verificar))
			{
				estoque.remove(verificar);
				estoque.add(novo);
				System.out.println("Parabéns, o calçado: "+verificar+" foi substituido pelo: "+novo);
			}
			else
			{
				System.out.println("\nAtenção, calçado não existente em estoque!!!");
			}
		}
		break;
		case 4:
		{
			System.out.println("Os calçados em estoque são: ");
			System.out.println(estoque);
		}
		break;
		case 5:
		{
			System.out.println("A quantidade de calçados em estoque são: ");
			System.out.println(quantEstoque);
		}
		
		default:
			System.out.println("Atenção, a opção digitada é inválida!!!");
		
		}
	}
		while (op!=6);

	}

}
