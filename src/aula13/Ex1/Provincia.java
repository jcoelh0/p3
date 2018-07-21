package aula13.Ex1;

public class Provincia extends Regiao {
	private String nome;
	private int populaçao;
	private String governador;
	
	public Provincia(String nome, int pop, String gov) {
		super(nome,pop);
		populaçao = pop;
		governador = gov;
	}

	public int getPopulaçao() {
		return populaçao;
	}

	public void setPopulaçao(int populaçao) {
		this.populaçao = populaçao;
	}

	public String getGovernador() {
		return governador;
	}

	public void setGovernador(String governador) {
		this.governador = governador;
	}

	public String getNome() {
		return nome;
	}
	
	

}
