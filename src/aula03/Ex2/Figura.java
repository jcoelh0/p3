package aula03.Ex2;

public class Figura {
	private Ponto centro;
	
	public Figura(double x, double y){
		this.centro = new Ponto(x, y);
	}
	
	public Ponto getPonto(){
		return centro;
	}

}
