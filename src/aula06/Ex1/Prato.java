package aula06.Ex1;

import java.util.LinkedList;

public class Prato {
	
	private String nome;
	LinkedList<Alimento> prato = new LinkedList<Alimento>();
	
	public Prato(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean addIngrediente(Alimento ali) {
		if(prato.contains(ali))
			return false;
		prato.add(ali);
		return true;
	}
	
	public Alimento infoAlimento(int i){
		return prato.get(i);
	}
	
	@Override
    public String toString(){     
		
		String s = "Prato '" + nome;
        
        for(Alimento a : prato.toArray(new Alimento[0]))
            s += "\n" + a.toString();

        return s;
        
    }
}
