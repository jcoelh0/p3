package aula03.Ex2;

public class Quadrado extends Figura{
	private double lado;
    
	public Quadrado(double lado, double x, double y){
		
		super(x, y);
		this.lado = lado;
	
	}
	
	public Quadrado(Quadrado q){
		
		super(q.getPonto().getX(), q.getPonto().getY());
		lado = q.lado();
	
	}
    public Quadrado(int lado) {
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
        return "Área: " + area() + "Perímetro: " + perimetro() + "lado: " + lado();
    }
    
    @Override
	public boolean equals(Object obj) {
		
		Quadrado other = (Quadrado) obj;
		if(!(area()== other.area()))
			return false;
		else if(!(perimetro()== other.perimetro()))
			return false;
		else if(!(lado()==other.lado()))
			return false;
		else return true;
	}
}
