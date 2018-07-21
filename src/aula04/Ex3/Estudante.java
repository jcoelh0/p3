package aula04.Ex3;

import java.time.LocalDateTime;

public class Estudante extends Cliente{

	private Data dataInsc;
	private int nMec;
	private String curso;

    public Estudante(int cc, String nome, Data dataNasc, int nmec, String curso, Data dataInsc){
    	
        super(cc, nome, dataNasc);
        
        this.dataInsc = dataInsc;
        this.curso = curso;
        nMec = nmec;
        
    }
    

	public Estudante(int cc, String nome, Data dataNasc, int nmec, String curso){
    	 
        super(cc, nome, dataNasc);
        LocalDateTime now = LocalDateTime.now();
        this.dataInsc = new Data(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
        this.curso = curso;
        nMec = nmec;
    
     }

    public int getNMec() {
        return nMec;
    }
    
    public String getCurso(){
    	return curso;
    }
    public Data getDataInsc(){
    	return dataInsc;
    }

    public String toString(){
        
          String s = super.toString() + " Numero Mecanografico: " + nMec + " Curso: " + curso + " Data de Inscricao: "+ dataInsc.toString();
    
         return s;
    
    }
    
}