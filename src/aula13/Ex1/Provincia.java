package aula13.Ex1;

public class Provincia extends Regiao {
	private String nome;
	private int popula�ao;
	private String governador;
	
	public Provincia(String nome, int pop, String gov) {
		super(nome,pop);
		popula�ao = pop;
		governador = gov;
	}

	public int getPopula�ao() {
		return popula�ao;
	}

	public void setPopula�ao(int popula�ao) {
		this.popula�ao = popula�ao;
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
