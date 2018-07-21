package aula04.Ex2;

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

	public boolean equals(Ponto p) {

		if (this.getX() == p.getX() && this.getY() == p.getY())
			return true;

		return false;

	}
	
	public String toString() {

		String s = "x: " + Double.toString(x) + ", y:" + Double.toString(y);

		return s;

	}
}
