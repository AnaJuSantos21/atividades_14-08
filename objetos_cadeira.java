package curso14_08;

public class objetos_cadeira {

	public static void main(String[] args) {
		    cadeira cadeira = new cadeira();
	        cadeira cadeira2 = new cadeira();
			
	        System.out.println("-----Cadeira-----");
			cadeira.setMarca("Marca MyMax");
			cadeira.setCor("preta");
			cadeira.setTamanho("tamanho médio");
			cadeira.setMateriais("Feito de couro");
			cadeira.setValor("R$ 198,99");
			
			System.out.println(cadeira.getMarca());
			System.out.println(cadeira.getCor());
			System.out.println(cadeira.getTamanho());
			System.out.println(cadeira.getMateriais());
			System.out.println(cadeira.getValor());
			System.out.println(cadeira.andar());
			System.out.println(cadeira.girar());
			System.out.println(cadeira.cair());
			
			 System.out.println("-----Cadeira 2-----");
			 cadeira2.setMarca("Marca MyMax");
			 cadeira2.setCor("branca");
			 cadeira2.setTamanho("tamanho médio");
			 cadeira2.setMateriais("Feito de courino");
			 cadeira2.setValor("R$ 235,99");
				
			 System.out.println(cadeira2.getMarca());
			 System.out.println(cadeira2.getCor());
			 System.out.println(cadeira2.getTamanho());
			 System.out.println(cadeira2.getMateriais());
			 System.out.println(cadeira2.getValor());
			 System.out.println(cadeira2.andar());
			 System.out.println(cadeira2.girar());
			 System.out.println(cadeira2.cair());
				

	}


}

