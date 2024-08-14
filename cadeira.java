package curso14_08;

public class cadeira {
	String marca;
	String cor;
    String tamanho;
	String materiais;
	String valor;
	String girar;
	String andar;
	String cair;
	

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTamanho() {
		return tamanho;
		
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() { //get mostra
		return cor;
	}
	public void setCor(String cor) { //set modifica
		this.cor = cor;
	}
	public String getMateriais() {
		return materiais;
	}
	public void setMateriais(String materiais) {
		this.materiais = materiais;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String girar() {
		return "Girando em 360 graus";
	}
	public String andar() {
		return "Andando para frente";
	}
	public String cair() {
		return "Caindo para trás";
	}


}
