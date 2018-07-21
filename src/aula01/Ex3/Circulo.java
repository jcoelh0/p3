package aula01.Ex3;

public class Circulo {
	private double raio;
    private Ponto centro;
 
    public Circulo(double raio, double x, double y) {
        centro = new Ponto(x, y);
        this.raio = raio;
    }
 
    public Circulo(double Raio, Ponto centro) {
        raio = Raio;
        this.centro = centro;
    }
    public double area() {
        return Math.PI * (raio * raio);
    }
 
    public double perimetro() {
        return 2 * Math.PI * raio;
    }
 
    public Ponto getCentro() {
        return centro;
    }
 
    public double getRaio() {
        return raio;
    }
 
    public String toString() {
        return "Área: " + area() + "Perimetro: " + perimetro() + "X: " + getCentro().getX() + "Y: " + getCentro().getY();
    }

}
