package aula13.Ex1;

public class Regiao {
	private String nome;
	private int populaçao;
	
	public Regiao(String nome, int populaçao) {
		this.nome = nome;
		this.populaçao = populaçao;
	}
	
	public int getPopulaçao() {
		return populaçao;
	}
	
	public void setPopulaçao(int populaçao) {
		this.populaçao = populaçao;
	}
	
	public String getNome() {
		return nome;
	}
	
}
