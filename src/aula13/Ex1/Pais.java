package aula13.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nome;
	private Localidade capital;
	private List<Regiao> regioes = new ArrayList<Regiao>();
	
	public Pais(String nome, Localidade cid) {
		assert cid.getLocal().equals(TipoLocalidade.Cidade) : 
			"Tipo de Localidade inv�lida para uma capital! N�o p�de ser criado esse pa�s!";
		this.nome = nome;
		
		
		//ex c)
		//if(!cid.getLocal().equals(TipoLocalidade.Cidade))
		//	throw new IllegalArgumentException("Capital Inv�lida");
		
		capital = cid;
	}

	public Pais(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public Localidade getCapital() {
		return capital;
	}

	public List<Regiao> getRegioes() {
		return regioes;
	}

	@Override
	public String toString() {
		int pop = 0;
		for (int i = 0; i < regioes.size(); i++) {
			pop += regioes.get(i).getPopula�ao();
		}
		if(capital!=null)
			return "Pa�s: " + nome + ", Popula��o: " + pop + " " + capital.toString();
		return "Pa�s: " + nome + ", Popula��o: " + pop + " (Capital: *Indefinida*)";
		
	}
	
	public void addRegiao(Estado est) {
		regioes.add(est);
	}
	
	public void addRegiao(Provincia prov) {
		regioes.add(prov);
	}
	
	

}
