package aula09.Ex2;

public class Copo implements Gelado{
	private Gelado gel;
	public Copo(Gelado gel){
		this.gel = gel;
		
	}
	@Override
	public void base(int i) {
		this.gel.base(i);
		System.out.print(" em copo"); 
	}
}
