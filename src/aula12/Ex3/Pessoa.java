package aula12.Ex3;

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
	public String cc(){
		return Integer.toString(this.cc);
	}
	public Data dataNasc(){
		return this.dataNasc;
	}
	
	public String toString(){
		return "Nome: " + this.nome + "\nCartão de cidadão: " + this.cc +
				"\nData de nascimento: " + this.dataNasc.toString(); 
	}
}