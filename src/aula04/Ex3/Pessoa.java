package aula04.Ex3;


public class Pessoa{
	private String nome;
	private int cc;
	private Data dataNasc;
	private int Nmec;
	private String curso;
	private int Nfunc;
	private int Nfiscal;
	
	
	
	public Pessoa(String nome, int cc, Data dataNasc, int nmec, String curso) {
		
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
		Nmec = nmec;
		this.curso = curso;
	} //ESTUDANTE
	
	public Pessoa(String nome, int cc, Data dataNasc, int nfunc, int nfiscal) {
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
		Nfunc = nfunc;
		Nfiscal = nfiscal;
	} //FUNCION�RIO

	public String getNome() {
		return nome;
	}

	public int getCc() {
		return cc;
	}

	public Data getDataNasc() {
		return dataNasc;
	}

	public int getNmec() {
		return Nmec;
	}

	public String getCurso() {
		return curso;
	}

	public int getNfunc() {
		return Nfunc;
	}

	public int getNfiscal() {
		return Nfiscal;
	}

	
	public String toString(){
		return "Nome: " + this.nome + "\nCart�o de cidad�o: " + this.cc +
				"\nData de nascimento: " + this.dataNasc.toString() +"\nN�mero mecanogr�fico:" + this.Nmec + 
				"\nCurso:" + this.curso + "\nN�mero de funcion�rio:" + Nfunc + "\nN�mero fiscal:" + Nfiscal; 
	}
	
}