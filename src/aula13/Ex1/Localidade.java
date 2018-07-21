package aula13.Ex1;

public class Localidade {
	private String nome;
	private int popula�ao;
	private String governador;
	private TipoLocalidade local;
	
	public Localidade(String nome, int i, TipoLocalidade local) throws IllegalArgumentException {
		this.nome = nome;
		popula�ao = i;
		this.local = local;
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

	public TipoLocalidade getLocal() {
		return local;
	}

	@Override
	public String toString() throws NullPointerException{
		return "(Capital: Cidade " + nome + ", popula��o " + popula�ao + ")";
	}
	
	
}
