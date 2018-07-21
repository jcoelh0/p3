package aula13.Ex1;

public class Estado extends Regiao{
	private String nome;
	private int populaçao;
	private Localidade capital;
	
	public Estado(String nome, int pop, Localidade cid1) {
		super(nome,pop);
		populaçao += pop;
		this.nome = nome;
		capital = cid1;
	}

	public Localidade getCapital() {
		return capital;
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
