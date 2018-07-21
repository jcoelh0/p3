package aula01.Ex3;

public class Quadrado {
	private int lado;
    
    public Quadrado(int lado) {
        this.lado =lado;
    }
    public int lado(){
    	return lado;
    	
    }
 
    public int area() {
        return lado*lado;
    }
 
    public int perimetro() {
        return lado*4;
    }
    public String toString() {
        return "Área: " + area() + "Perímetro: " + perimetro() + "lado: " + lado();
    }
}
