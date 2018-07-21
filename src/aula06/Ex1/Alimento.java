package aula06.Ex1;

public abstract class Alimento {
	public abstract double getProteinas();
	public abstract double getCalorias();
	public abstract double getPeso();
	public abstract boolean getVegetariano();
	public abstract String String();
	
	@Override
	public String toString(){      
   
		String s = String() + "Proteínas " + getProteinas() + ", calorias: " + getCalorias() + ", Peso " + getPeso();

		return s;
	   
	}
}
