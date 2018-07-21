package aula09.Ex2;

public class Topping implements Gelado {
	private Gelado gel;
	private String topping;
	public Topping(Gelado gel, String topping){
		this.gel = gel;
		this.topping = topping;
	}
	@Override
	public void base(int i) {
		this.gel.base(i);
		System.out.print(" com " + topping);
		
	}

}
//2 bolas de gelado de Baunilha com Canela
//1 bola de gelado de Baunilha com Nozes