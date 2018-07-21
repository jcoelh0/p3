package aula03.Ex1;

public class Pessoa {
	private String nome;
	private int cc;
	private Data dataNasc;

	public Pessoa(String nome, int cc, Data dataNasc){
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
	}
	public String nome(){
		return this.nome;
	}
	public int cc(){
		return this.cc;
	}
	public Data dataNasc(){
		return this.dataNasc;
	}
	
	public String toString(){
		return "Nome: " + this.nome + "\nCartão de cidadão: " + this.cc +
				"\nData de nascimento: " + this.dataNasc.toString(); 
	}
}