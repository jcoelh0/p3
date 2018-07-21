package aula13.Ex1;

public class Estado extends Regiao{
	private String nome;
	private int popula�ao;
	private Localidade capital;
	
	public Estado(String nome, int pop, Localidade cid1) {
		super(nome,pop);
		popula�ao += pop;
		this.nome = nome;
		capital = cid1;
	}

	public Localidade getCapital() {
		return capital;
	}

	public int getPopula�ao() {
		return popula�ao;
	}

	public void setPopula�ao(int popula�ao) {
		this.popula�ao = popula�ao;
	}

	public String getNome() {
		return nome;
	}
}
