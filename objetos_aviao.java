package curso14_08;

import curso07_08.Carro;

public class objetos_aviao {

	public static void main(String[] args) {
	aviao aviao = new aviao();
		
		aviao.setMarca("Azulzinho");
		aviao.setPorte("Grande");
		aviao.setCor("Azul");
		aviao.setAssentos(180);
		
		System.out.println(aviao.getMarca());
		System.out.println(aviao.getPorte());
		System.out.println(aviao.getCor());
		System.out.println(aviao.getAssentos());
		System.out.println(aviao.voar());
		System.out.println(aviao.pousar());
		System.out.println(aviao.planar());

	}

}
