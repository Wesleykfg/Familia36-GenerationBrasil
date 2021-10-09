package POOHERANCA;

import java.util.Scanner;

public class TesteCavaloPreguicaCachorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int op = 0;
		Cachorro dog = new Cachorro("Max", 3, "Au Au... Auuuuuuuuu", 
				4, "baixa", "ra��o", "gost muito de correr", "possui os pelos caramelo",
				"� castrado", "ra�a indefinida");
		dog.setNome("Max");
		dog.setIdade(3);
		dog.setEmitirSom("Au Au... Auuuuuuuuuu");
		dog.setQuantdePatas(4);
		dog.setPericulosidade("Baixa");
		dog.setAlimentacao("Ra��o");
		dog.setDeveCorrer("Gosta muito de correr");
		dog.setPelos("Possui os pelos caramelo");
		dog.setCastrado("� castrado");
		dog.setRaca("Ra�a indefinida");
		
		Cavalo horse = new Cavalo("Logan", 7, "Hiin in in", 4, "media", "feno",
				"Para fazer exercicios o cavalo deve correr",
				"marrom", "N�o cruzou", 88);
		
		Preguica preg = new Preguica("Lana", 4, "Nyan", 4, "Nula", "Folhas", "A pregui�a n�o corre",
				"Acizentados", 2, "Sedent�ria", "A pregui�a anda lentamente");
		

		
		
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
				+"\nDe que bichinho voc� deseja saber alguma informa��o: "
				+"\n1 - Cachorro"
				+"\n2 - Cavalo"
				+"\n3 - Pregui�a");
		
		op = leia.nextInt();
		
		switch (op)
		{
		case 1:
			System.out.println("\nO nome do cachorrinho �: ");
			System.out.println(dog.getNome());
			System.out.println("\nA idade dele �: ");
			System.out.println(dog.getIdade());
			System.out.println("O som que o cachorrinho faz �:");
			System.out.println(dog.getEmitirSom());
			System.out.println("\nA quantidade de patinhas que o cachorrinho tem �: ");
			System.out.println(dog.getQuantdePatas());
			System.out.println("\nNormalmente a periculosidade do cachorrinho �: ");
			System.out.println(dog.getPericulosidade());
			System.out.println("\nUm cachorrinho deve ser alimento com: ");
			System.out.println(dog.getAlimentacao());
			System.out.println("\nPara manter sua saude e energia o cachorrinho deve se exercitar ja que: ");
			System.out.println(dog.getDeveCorrer());
			System.out.println("\nA colora��o normalmente varia, por�m, o nosso: ");
			System.out.println(dog.getPelos());
			System.out.println(horse.getCruzou());
			System.out.println("\nNosso querido cachorrinho possui: ");
			System.out.println(dog.getRaca());
		
		break;
		
		case 2:
			System.out.println("\nO nome do cavalo �: ");
			System.out.println(horse.getNome());
			System.out.println("\nA idade dele �: ");
			System.out.println(horse.getIdade());
			System.out.println("O som que o cavalo faz �:");
			System.out.println(horse.getEmitirSom());
			System.out.println("\nA quantidade de patas que o cavalo tem �: ");
			System.out.println(horse.getQuantdePatas());
			System.out.println("\nNormalmente a periculosidade do cavalo �: ");
			System.out.println(horse.getPericulosidade());
			System.out.println("\nUm cavalo deve ser alimento com: ");
			System.out.println(horse.getAlimentacao());
			System.out.println(horse.getDeveCorrer());
			System.out.println("\nA colora��o normalmente varia, por�m, o nosso: ");
			System.out.println(horse.getPelos());
			System.out.println(horse.getCruzou());
			System.out.println("\nO cavalo pode chegar a velocidade de: ");
			System.out.println(horse.getVelocidade());
		
		break;
		
		case 3:
			System.out.println("\nO nome da pregui�a �: ");
			System.out.println(preg.getNome());
			System.out.println("\nA idade dela �: ");
			System.out.println(preg.getIdade());
			System.out.println("O som que a pregui�a faz �:");
			System.out.println(preg.getEmitirSom());
			System.out.println("\nA quantidade de patas que a pregui�a tem �: ");
			System.out.println(preg.getQuantdePatas());
			System.out.println("\nNormalmente a periculosidade da pregui�a �: ");
			System.out.println(preg.getPericulosidade());
			System.out.println("\nA pregui�a se alimenta com: ");
			System.out.println(preg.getAlimentacao());
			System.out.println(preg.getDeveCorrer());
			System.out.println("\nA colora��o normalmente varia, por�m, o nosso: ");
			System.out.println(preg.getPelos());
			System.out.println("\nNormalemnte a pregui�a tem x Unhas: ");
			System.out.println(preg.getQuantGarras());
			System.out.println("\nO condicionamento de uma pregui�a �: ");
			System.out.println(preg.getCondFisico());
			System.out.println(preg.getMovimentacao());
		
		break;
		
		}
		

	}

}
