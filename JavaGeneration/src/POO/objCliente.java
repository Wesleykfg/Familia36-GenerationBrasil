package POO;

public class objCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli = new Cliente();
		cli.setNome("Paulo");
		cli.setItensComprados(7);
		cli.setQuantGasta(2500);
		
		System.out.println(cli.getNome());
		System.out.println(cli.getItensComprados());
		System.out.println(cli.getQuantGasta());

	}

}
