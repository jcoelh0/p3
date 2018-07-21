package aula03.Ex2;

public class Retangulo extends Figura{
	private double comp;
	private double larg;

	public Retangulo(double x, double y, double largura, double comp) {
		super(x, y);
		larg = largura;
		this.comp = comp;

	}

	public Retangulo(Retangulo r) {
		super(r.getPonto().getX(), r.getPonto().getY());
		larg = r.larg();
		comp = r.comp();

	}

	public Retangulo(double larg, double comp) {
		super(0, 0);
		this.comp = comp;
		this.larg = larg;

	}

	public double comp() {
		return comp;
	}

	public double larg() {
		return larg;

	}

	public double area() {
		return comp * larg;
	}

	public double perimetro() {
		return comp * 2 + larg * 2;
	}

	public String toString() {
		return "Ã?rea: " + area() + ", Perimetro: " + perimetro() + ", comprimento: " 
				+ comp() + ", largura:" + larg();
	}
	
    @Override
	public boolean equals(Object obj) {
		
    	Retangulo other = (Retangulo) obj;
		if(!(area()== other.area()))
			return false;
		else if(!(perimetro()== other.perimetro()))
			return false;
		else if(!(larg()==other.larg()))
			return false;
		else if(!(comp()==other.comp()))
			return false;
		else return true;
    }

}
