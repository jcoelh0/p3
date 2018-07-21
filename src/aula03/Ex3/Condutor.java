package aula03.Ex3;

public class Condutor{
	private String nome;
	private char tipo;
	
	public Condutor(String nome, char tipo){
		this.setNome(nome);
		this.setTipo(tipo);
	}

	public char getTipo() {
		return tipo;
	}
	public String getNome() {
		return nome;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
