package aula04.Ex1;
import java.time.LocalDateTime;
public class Professor extends Pessoa {
	private static int func=1;
	private int nfunc;
	private Data dataAdmissao;

	
	public Professor(String inome,int icc,Data idataNasc,Data dataAdmissao) {
		super(inome,icc,idataNasc);
		nfunc = func++;
		this.dataAdmissao = dataAdmissao;
		
	}
	public Professor(String inome,int icc,Data idataNasc) {
		super(inome,icc,idataNasc);
		nfunc = func++;
		LocalDateTime now = LocalDateTime.now();
		dataAdmissao = new Data(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
	}
	public int getNfunc() {
		return nfunc;
	}
	public void setNfunc(int nfunc) {
		this.nfunc = nfunc;
	}
	public Data getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Data dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
}
