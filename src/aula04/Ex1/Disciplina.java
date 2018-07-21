package aula04.Ex1;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private String area;
	private int ECTS;
	private Professor Respons�vel;
	private ArrayList<Estudante> Alunos = new ArrayList<Estudante>();
	
	public Disciplina(String nome, String area, int eCTS, Professor respons�vel) {
		super();
		this.nome = nome;
		this.area = area;
		ECTS = eCTS;
		Respons�vel = respons�vel;
	}
	
	public boolean addAluno(Estudante est){ // Adiciona um aluno � Disciplina
		boolean k = true;
		for (int i = 0; i < this.Alunos.size(); i++) {
			if(this.Alunos.get(i).cc() == est.cc()){
				k = false;
			}
		}
		if(k) this.Alunos.add(est);
		return k;
	}
	
	public boolean delAluno(int nMec){ // Remove um aluno da Disciplina
		boolean k = false;
		for (int j = 0; j < this.Alunos.size(); j++) {
			if(this.Alunos.get(j).nMec() == nMec){
				this.Alunos.remove(j);
	            k = true;
			}
		}
		return k;
	}
	
	public boolean alunoInscrito(int nMec){ // Verifica se aluno est� inscrito � disciplina
		boolean k = false;
		for (int j = 0; j < this.Alunos.size(); j++) {
			if(this.Alunos.get(j).nMec() == nMec){
				k = true;
			}
		}
		return k;
	}
	public int numAlunos(){ // Retorna o N� de Alunos Inscritos
		return this.Alunos.size();
	}
	public String toString(){ // Retorna as caracter�sticas da Disciplina
		return "Nome da Disciplina: " + nome + ", �rea:" + area + ", ECTS:" + ECTS + 
			   ", Professor respons�vel:" + Respons�vel+ ", Alunos:" + 
			   "\nExistem " + numAlunos() + " alunos Inscritos";
	
	}
	public Estudante[] getAlunos(){ // Retorna uma lista com todos alunos da disciplina
		Estudante[] array = new Estudante[this.Alunos.size()];
		
		for(int j=0; j<this.Alunos.size(); j++)
			array[j] = this.Alunos.get(j);
	
		return array;
	}
	
	public Estudante[] getAlunos(String tipo){ // Retorna uma lista com todos os alunos
											   // da disciplina do subtipo �tipo�
		Estudante[] alunosTipo = getAlunos();
		
		int size = 0;
		int j = 0;
		
		for(int i=0; i <alunosTipo.length; i++)
			if(alunosTipo[i].est().equalsIgnoreCase(tipo))
				size++;
	
		Estudante alunosTipo2[] = new Estudante[size];
		
		for(int i=0; i<alunosTipo.length; i++)
			if(alunosTipo[i].est().equalsIgnoreCase(tipo)){				
				alunosTipo2[j++] = alunosTipo[i];
			}
		return alunosTipo;
	}
}

