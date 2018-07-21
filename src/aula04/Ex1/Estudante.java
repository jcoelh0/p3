package aula04.Ex1;

import java.time.LocalDateTime;

public class Estudante extends Pessoa {
	private static int nAlunos=100;
	private int nMec;
	private Data dataInsc;
	
	
	public Estudante(String iNome, int iBI, Data iDataNasc, Data iDataInsc){
		super(iNome,iBI,iDataNasc);
		nMec=nAlunos++;
		dataInsc = iDataInsc;
	}

	public Estudante(String iNome, int iBI, Data iDataNasc){
		super(iNome,iBI,iDataNasc);
		nMec=nAlunos++;
		LocalDateTime now = LocalDateTime.now();
		dataInsc = new Data(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
	}
	

	public int nMec() {
		return nMec;
	}

	public Data getDataInsc() {
		return dataInsc;
	}
	
	public String est(){
		return "estudante";
	}
	
	@Override
	public String toString() {
		return  super.nome() + ", Número Mecanográfico:" + nMec + ", Data de "
				+ "Inscrição: " + dataInsc;
	}
	
}
