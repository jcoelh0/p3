package aula06.Ex1;

public class Carne extends Alimento{
	public enum VariedadeCarne{
		vaca, porco, peru, frango, outra
	}
	
	private double proteinas;
	private double calorias;
	private double peso;
	private VariedadeCarne variedade;
	
	public Carne(VariedadeCarne v, double proteinas, double calorias, double peso) {
		this.proteinas = proteinas;
		this.calorias = calorias;
		this.peso = peso;
		this.variedade = v;
		
	}
	
	public double getProteinas() {
		return proteinas;
	}
	public double getCalorias() {
		return calorias;
	}
	public double getPeso() {
		return peso;
	}

	public VariedadeCarne getVariedade() {
		return variedade;
	}
	@Override
	public boolean getVegetariano() {
		return false;
	}

	@Override
	public String String() {
		return "Carne: " + variedade.name() + " ";
	}
	
}
