package aula06.Ex1;


import java.util.LinkedList;
import java.util.TreeMap;

public class Ementa {
	
	@SuppressWarnings("unchecked")
	private LinkedList<Prato>[] ementa = new LinkedList[7];
	//private TreeMap<Prato, String> ementa = new TreeMap<Prato, String>();
	private String nome;
	private String local;

	public Ementa(String nome, String local) {
		this.nome = nome;
		this.local = local;
		for(int i = 0; i < ementa.length; i++){
			ementa[i] = new LinkedList<Prato>();
		}
	}
	
	public String getNome() {
		return nome;
	}

	public String getLocal() {
		return local;
	}

	public void addPrato(Prato prato, DiaSemana diaSemana) {
		ementa[diaSemana.getNum()].add(prato);
		//ementa.put(prato, ((DiaSemana) diaSemana).name());
	}
	
	@Override
	public String toString(){
	        
	    String s = "";
	       
	    for (int i=0; i<this.ementa.length; i++) {
	            
	        for (Prato p: ementa[i].toArray(new Prato[0]))
	            s += p.toString();
	        
	      // s += ", dia " + ;
	    }
	        
	    return s;
	        
	}
}
