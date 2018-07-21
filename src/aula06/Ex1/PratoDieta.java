package aula06.Ex1;

import java.util.LinkedList;

public class PratoDieta extends Prato{
	
	private String nome;
	private double caloriasMax;
	LinkedList<Alimento> pratoDieta = new LinkedList<Alimento>();
	
	public PratoDieta(String nome, double caloriasMax) {
		super(nome);
		this.nome = nome;
		this.caloriasMax = caloriasMax;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getCaloriasMax() {
		return caloriasMax;
	}
	
	public boolean addIngrediente(Alimento ali) {
		if(pratoDieta.contains(ali) || ali.getCalorias()>caloriasMax)
			return false;
		pratoDieta.add(ali);
		return true;
	}
}
