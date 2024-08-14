package curso14_08;

public class Cliente {
		String nome;
		String telefone;
	    String cpf;
		int id;
		String rg;
		String compra;
		String escolhe;
		String endereco;
		String experimenta;
		String devolve;

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getRg() {
			return rg;
			
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getCpf() { //get mostra
			return cpf;
		}
		public void setCpf(String cpf) { //set modifica
			this.cpf = cpf;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEndereco() { //get mostra
			return endereco;
		}
		public void setEndereco(String endereco) { //set modifica
			this.endereco = endereco;
		}
		public String compra() {
			return "compra produtos";
		}
		public String escolhe() {
			return "Escolhe produtos";
		}
		public String experimenta() {
			return "Experimenta os produtos";
		}
		public String devolve() {
			return "Devolvendo o produto";
		}

		


	


	}


