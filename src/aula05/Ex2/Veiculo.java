package aula05.Ex2;

import aula05.Ex1.Comparable;

public class Veiculo implements Comparable{
	
	private enum Cor{
		Vermelho, Laranja, Violeta, Azul, Ciano, Verde, Amarelo, Preto, Branco
	};
	
	private int ano;
	private Cor cor;
	private int nRodas;
		
	public Veiculo(int ano, String cor, int nRodas){
		
		this.ano = ano;
		this.nRodas = nRodas;
		this.cor = Cor.valueOf(cor);
		
	}
	
	public int compareTo(Object b){
		if(this.ano < ((Veiculo)b).ano){
			return -1;
		}else if(this.ano > ((Veiculo)b).ano){
			return 1;
		}else{
			return 0;
		}
	}
	
	@Override
	public boolean equals(Object b){
		if(b == null){
			return false;
		}
		if(getClass() != b.getClass()){
			return false;
		}
		return ano == ((Veiculo)b).ano && cor.equals(((Veiculo)b).cor) && 
				nRodas == ((Veiculo)b).nRodas;
	}
	
	@Override 
	public String toString(){
		return getClass().getSimpleName() + "\nAno: " + this.ano+"\nCor: " +
				this.cor.toString() + "\nNúmero de rodas: " + this.nRodas;
	}
}
