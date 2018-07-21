package aula09.Ex2;

public class Cone implements Gelado{
	private Gelado gel;
	public Cone(Gelado gel){
		this.gel = gel;
		
	}
	@Override
	public void base(int i) {
		this.gel.base(i);
		System.out.print(" em cone"); 
	}
}

