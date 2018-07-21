package aula13.Ex1;

public class Localidade {
	private String nome;
	private int populaçao;
	private String governador;
	private TipoLocalidade local;
	
	public Localidade(String nome, int i, TipoLocalidade local) throws IllegalArgumentException {
		this.nome = nome;
		populaçao = i;
		this.local = local;
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

	public TipoLocalidade getLocal() {
		return local;
	}

	@Override
	public String toString() throws NullPointerException{
		return "(Capital: Cidade " + nome + ", população " + populaçao + ")";
	}
	
	
}
