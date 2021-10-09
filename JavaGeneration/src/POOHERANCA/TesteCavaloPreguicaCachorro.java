package POOHERANCA;

import java.util.Scanner;

public class TesteCavaloPreguicaCachorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int op = 0;
		Cachorro dog = new Cachorro("Max", 3, "Au Au... Auuuuuuuuu", 
				4, "baixa", "ração", "gost muito de correr", "possui os pelos caramelo",
				"é castrado", "raça indefinida");
		dog.setNome("Max");
		dog.setIdade(3);
		dog.setEmitirSom("Au Au... Auuuuuuuuuu");
		dog.setQuantdePatas(4);
		dog.setPericulosidade("Baixa");
		dog.setAlimentacao("Ração");
		dog.setDeveCorrer("Gosta muito de correr");
		dog.setPelos("Possui os pelos caramelo");
		dog.setCastrado("É castrado");
		dog.setRaca("Raça indefinida");
		
		Cavalo horse = new Cavalo("Logan", 7, "Hiin in in", 4, "media", "feno",
				"Para fazer exercicios o cavalo deve correr",
				"marrom", "Não cruzou", 88);
		
		Preguica preg = new Preguica("Lana", 4, "Nyan", 4, "Nula", "Folhas", "A preguiça não corre",
				"Acizentados", 2, "Sedentária", "A preguiça anda lentamente");
		

		
		
		System.out.println("\n\t\t\t\t******************************"
				+"\n\t\t\t\t********************************"
				+"\n\t\t\t\t*******SEJA BEM VINDI***********"
				+"\n\t\t\t\t********************************"
				+"  \n\t\t\t\t******************************");
		
		System.out.println("                   #######  ######                      ####    ###  ##   ####      ##\r\n"
				+ "                    ##   #  # ## #                       ##      ##  ##    ##      ####\r\n"
				+ " ######   ######    ## #      ##              ##   ##    ##      ## ##     ##     ##  ##\r\n"
				+ "  ##  ##   ##  ##   ####      ##              ## # ##    ##      ####      ##     ##  ##\r\n"
				+ "  ##  ##   ##  ##   ## #      ##              #######    ##      ## ##     ##     ######\r\n"
				+ "  #####    #####    ##   #    ##              #######    ##      ##  ##    ##     ##  ##\r\n"
				+ "  ##       ##      #######   ####              ## ##    ####    ###  ##   ####    ##  ##\r\n"
				+ " ####     ####");
		
		System.out.println("\nSeja bem vindo ao PPet Wikia, a sua wikia dos animais: "
				+"\nDe que bichinho você deseja saber alguma informação: "
				+"\n1 - Cachorro"
				+"\n2 - Cavalo"
				+"\n3 - Preguiça");
		
		op = leia.nextInt();
		
		switch (op)
		{
		case 1:
			System.out.println("\nO nome do cachorrinho é: ");
			System.out.println(dog.getNome());
			System.out.println("\nA idade dele é: ");
			System.out.println(dog.getIdade());
			System.out.println("O som que o cachorrinho faz é:");
			System.out.println(dog.getEmitirSom());
			System.out.println("\nA quantidade de patinhas que o cachorrinho tem é: ");
			System.out.println(dog.getQuantdePatas());
			System.out.println("\nNormalmente a periculosidade do cachorrinho é: ");
			System.out.println(dog.getPericulosidade());
			System.out.println("\nUm cachorrinho deve ser alimento com: ");
			System.out.println(dog.getAlimentacao());
			System.out.println("\nPara manter sua saude e energia o cachorrinho deve se exercitar ja que: ");
			System.out.println(dog.getDeveCorrer());
			System.out.println("\nA coloração normalmente varia, porém, o nosso: ");
			System.out.println(dog.getPelos());
			System.out.println(horse.getCruzou());
			System.out.println("\nNosso querido cachorrinho possui: ");
			System.out.println(dog.getRaca());
		
		break;
		
		case 2:
			System.out.println("\nO nome do cavalo é: ");
			System.out.println(horse.getNome());
			System.out.println("\nA idade dele é: ");
			System.out.println(horse.getIdade());
			System.out.println("O som que o cavalo faz é:");
			System.out.println(horse.getEmitirSom());
			System.out.println("\nA quantidade de patas que o cavalo tem é: ");
			System.out.println(horse.getQuantdePatas());
			System.out.println("\nNormalmente a periculosidade do cavalo é: ");
			System.out.println(horse.getPericulosidade());
			System.out.println("\nUm cavalo deve ser alimento com: ");
			System.out.println(horse.getAlimentacao());
			System.out.println(horse.getDeveCorrer());
			System.out.println("\nA coloração normalmente varia, porém, o nosso: ");
			System.out.println(horse.getPelos());
			System.out.println(horse.getCruzou());
			System.out.println("\nO cavalo pode chegar a velocidade de: ");
			System.out.println(horse.getVelocidade());
		
		break;
		
		case 3:
			System.out.println("\nO nome da preguiça é: ");
			System.out.println(preg.getNome());
			System.out.println("\nA idade dela é: ");
			System.out.println(preg.getIdade());
			System.out.println("O som que a preguiça faz é:");
			System.out.println(preg.getEmitirSom());
			System.out.println("\nA quantidade de patas que a preguiça tem é: ");
			System.out.println(preg.getQuantdePatas());
			System.out.println("\nNormalmente a periculosidade da preguiça é: ");
			System.out.println(preg.getPericulosidade());
			System.out.println("\nA preguiça se alimenta com: ");
			System.out.println(preg.getAlimentacao());
			System.out.println(preg.getDeveCorrer());
			System.out.println("\nA coloração normalmente varia, porém, o nosso: ");
			System.out.println(preg.getPelos());
			System.out.println("\nNormalemnte a preguiça tem x Unhas: ");
			System.out.println(preg.getQuantGarras());
			System.out.println("\nO condicionamento de uma preguiça é: ");
			System.out.println(preg.getCondFisico());
			System.out.println(preg.getMovimentacao());
		
		break;
		
		}
		

	}

}
