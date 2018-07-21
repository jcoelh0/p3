package aula06.Ex1;

public class Peixe extends Alimento{
	
	public enum TipoPeixe{
		congelado,fresco
	}
	private double proteinas;
	private double calorias;
	private double peso;
	private TipoPeixe tipoPeixe;
	
	public Peixe(TipoPeixe p, double proteinas, double calorias, double peso) {
		tipoPeixe = p;
		this.proteinas = proteinas;
		this.calorias = calorias;
		this.peso = peso;
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

	public TipoPeixe getTipoPeixe() {
		return tipoPeixe;
	}

	@Override
	public boolean getVegetariano() {
		return true;
	}

	@Override
	public String String() {
		return "Peixe: " + tipoPeixe.name() + " ";
	}

}
