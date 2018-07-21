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
	} //FUNCIONÁRIO

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
		return "Nome: " + this.nome + "\nCartão de cidadão: " + this.cc +
				"\nData de nascimento: " + this.dataNasc.toString() +"\nNúmero mecanográfico:" + this.Nmec + 
				"\nCurso:" + this.curso + "\nNúmero de funcionário:" + Nfunc + "\nNúmero fiscal:" + Nfiscal; 
	}
	
}