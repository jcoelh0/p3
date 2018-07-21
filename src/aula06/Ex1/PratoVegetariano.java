package aula06.Ex1;

import java.util.LinkedList;

public class PratoVegetariano extends Prato{
	
	private String nome;
	LinkedList<Alimento> pratoVeg = new LinkedList<Alimento>();
	
	public PratoVegetariano(String nome) {
		super(nome);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean addIngrediente(Alimento ali) {
		if(pratoVeg.contains(ali) || !ali.getVegetariano())
			return false;
		pratoVeg.add(ali);
		return true;
	}
}
