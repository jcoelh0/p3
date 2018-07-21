package aula04.Ex2;

import aula05.Ex1.Comparable;
public abstract class Figura implements Comparable{
	private Ponto centro;
	
	public Figura(double x, double y){
		this.centro = new Ponto(x, y);
	}
	
	public Ponto getPonto(){
		return centro;
	}
	
	public abstract double area();

	public abstract double perimetro();

	public int compareTo(Object obj) {
		assert (obj == null) && (obj instanceof Figura);
		
		Figura f = (Figura) obj;
		double dif = area() - f.area();
		if(dif == 0)
			return 0;
		else if(dif < 0)
			return -1;
		else return 1;
	
	}
}
