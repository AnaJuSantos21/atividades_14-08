package curso14_08;

public class aviao {
	String marca;
	String cor;
    String porte;
	int assentos;
	String decolando;
	String pousar;
	String planar;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPorte() {
		return porte;
		
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getCor() { //get mostra
		return cor;
	}
	public void setCor(String cor) { //set modifica
		this.cor = cor;
	}
	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public String voar() {
		return "voando em 15 minutos";
	}
	public String pousar() {
		return "Pousando em 2 horas";
	}
	public String planar() {
		return "Planando";
	}

	


}


