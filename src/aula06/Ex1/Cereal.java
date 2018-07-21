package aula06.Ex1;

public class Cereal extends Alimento{
	
	private String nome;
	private double proteinas;
	private double calorias;
	private double peso;
	
	public Cereal(String nome, double proteinas, double calorias, double peso) {
		this.nome = nome;
		this.proteinas = proteinas;
		this.calorias = calorias;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
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
	@Override
	public boolean getVegetariano() {
		return true;
	}

	@Override
	public String String() {
		return "Cereal: ";
	}
	
	
}
