package aula09.Ex2;

public class GeladoSimples implements Gelado {
	private String flavour;
	
	public GeladoSimples(String f) { 
		flavour = f; 
	}
	
	@Override
	public void base(int i){ 
		System.out.print("\n" + i + " bolas de gelado de " + flavour); 
	}
}
