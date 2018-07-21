package aula04.Ex1;

public class Bolseiro extends Estudante{
	private int Bolsa;
	
	public Bolseiro(String iNome, int inMec, Data iDataNasc){
		super(iNome,inMec,iDataNasc);
		
	}
	
	public int bolsa() {
		return Bolsa;
	}

	public void setBolsa(int Bolsa) {
		this.Bolsa = Bolsa;
	}

	@Override
	public String toString() {
		return "Bolseiro [montanteBolsa=" + Bolsa + "]";
	}
	
}
