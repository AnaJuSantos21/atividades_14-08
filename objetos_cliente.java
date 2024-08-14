package curso14_08;

public class objetos_cliente {

	public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
		
        System.out.println("-----Cliente-----");
		cliente.setNome("Ana Julya");
		cliente.setTelefone("991703546");
		cliente.setCpf("5996785432");
		cliente.setId(18097);
		cliente.setRg("123456789");
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getId());
		System.out.println(cliente.getRg());
		System.out.println(cliente.compra());
		System.out.println(cliente.escolhe());
		System.out.println(cliente.experimenta());
		System.out.println(cliente.devolve());
		
		 System.out.println("-----Cliente 2-----");
			cliente2.setNome("Giovana");
			cliente2.setTelefone("987654321");
			cliente2.setCpf("6789532");
			cliente2.setId(97865);
			cliente2.setRg("19283745");
			
			System.out.println(cliente2.getNome());
			System.out.println(cliente2.getTelefone());
			System.out.println(cliente2.getCpf());
			System.out.println(cliente2.getId());
			System.out.println(cliente2.getRg());
			System.out.println(cliente2.compra());
			System.out.println(cliente2.escolhe());
			System.out.println(cliente2.experimenta());
			System.out.println(cliente2.devolve());

	}

	}


