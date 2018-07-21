package aula01.Ex3;

public class Ponto {
	private double x, y;
 
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
 
    public Ponto(Ponto centro) {
        this.x = centro.getX();
        this.y = centro.getY();
    }
 
     
    public double getX() {
        return x;
    }
 
    public double getY() {
        return y;
    }

}
