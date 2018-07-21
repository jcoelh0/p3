package aula04.Ex2;

public class Circulo extends Figura{
	private double raio;
    
    public Circulo(double x, double y, double raio) {
        super(x,y);
        this.raio = raio;
    }
 
    public Circulo(double raio){
		super(0,0);
		this.raio = raio;
	}
    public Circulo(Circulo c1){
    	super(c1.getPonto().getX(), c1.getPonto().getY());
    	raio = c1.getRaio();
    }
    public double area() {
        return Math.PI * (raio * raio);
    }
 
    public double perimetro() {
        return 2 * Math.PI * raio;
    }
 
    public double getRaio() {
        return raio;
    }
 
    public String toString() {
        return ("Circulo de Centro: X: " + getPonto().getX() + ", Y: " + getPonto().getY() + ", Raio:" +
        		getRaio());
    }

    
    //@Override public boolean equals(Object b){
	//	return super.equals(b) && raio==((Circulo)b).raio;
    //}
    //
}
