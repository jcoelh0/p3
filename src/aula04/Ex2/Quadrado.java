package aula04.Ex2;

public class Quadrado extends Retangulo{
	private double lado;
    
	public Quadrado(double x, double y, double lado){
		
		super(x, y);
		this.lado = lado;
	
	}
	
	public Quadrado(Quadrado q){
		
		super(q.getPonto().getX(), q.getPonto().getY());
		lado = q.lado();
	
	}
    public Quadrado(double lado) {
        super(0,0);
    	this.lado =lado;
    }
    
    public double lado(){
    	return lado;
    }
 
    public double area() {
        return lado*lado;
    }
 
    public double perimetro() {
        return lado*4;
    }
    public String toString() {
        return "Quadrado de Centro x: " + Double.toString(getPonto().getX()) + ", y:" + 
        		Double.toString(getPonto().getY()) + " e de lado " + Double.toString(lado);
    }
    
    public boolean equals(Quadrado q) {
		
	    if(lado == q.lado())
	    	return true;
			
	    return false;

    }
    
}
