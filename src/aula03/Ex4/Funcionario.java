package aula03.Ex4;

import java.time.LocalDateTime;

public class Funcionario extends Cliente{

	private Data dataInsc;
	private int nFisc;
	private int nFunc;

	public Funcionario(int cc, String nome, Data dataNasc, int nfunc, int nfisc, Data dataInsc) {

		super(cc, nome, dataNasc);

		this.dataInsc = dataInsc;
		nFisc = nfisc;
		nFunc = nfunc;

	}

	public Funcionario(int cc, String nome, Data dataNasc, int nfunc, int nfisc) {

		super(cc, nome, dataNasc);
		LocalDateTime now = LocalDateTime.now();
		this.dataInsc = new Data(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
		nFisc = nfisc;
		nFunc = nfunc;

	}

	public int getNFisc() {
		return nFisc;
	}

	public int getNFunc() {
		return nFunc;
	}

	public String toString() {

		String s = super.toString() + " Numero de Funcionario: " + nFunc + " Numero Fiscal: " + nFisc
				+ " Data de Inscricao: " + dataInsc.toString();

		return s;

	}

}