package aula13.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nome;
	private Localidade capital;
	private List<Regiao> regioes = new ArrayList<Regiao>();
	
	public Pais(String nome, Localidade cid) {
		assert cid.getLocal().equals(TipoLocalidade.Cidade) : 
			"Tipo de Localidade inválida para uma capital! Não pôde ser criado esse país!";
		this.nome = nome;
		
		
		//ex c)
		//if(!cid.getLocal().equals(TipoLocalidade.Cidade))
		//	throw new IllegalArgumentException("Capital Inválida");
		
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
			pop += regioes.get(i).getPopulaçao();
		}
		if(capital!=null)
			return "País: " + nome + ", População: " + pop + " " + capital.toString();
		return "País: " + nome + ", População: " + pop + " (Capital: *Indefinida*)";
		
	}
	
	public void addRegiao(Estado est) {
		regioes.add(est);
	}
	
	public void addRegiao(Provincia prov) {
		regioes.add(prov);
	}
	
	

}
