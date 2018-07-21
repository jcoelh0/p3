package aula05.Ex2;

public class BicicletaPolicia extends Bicicleta implements Policia {
	Tipo tipo;
	String ID;
	
	public BicicletaPolicia(int ano,String cor,int nRodas,String tipoB,String tipoPolicia, String ID) {
		super(ano, cor, nRodas, tipoB);
		
		this.tipo = Tipo.valueOf(tipoPolicia);
		setID(ID);
	}
	
	@Override
	public void setID(String ID){
		this.ID = ID;
	}
	
	@Override
	public String getID(){
		return ID;
	}
	
	@Override
	public String getTipo() {
		return tipo.toString();
	}
	
	@Override
	public boolean equals(Object b){
		return super.equals(b) && tipo.equals(((BicicletaPolicia)b).tipo) && 
				ID.equals(((BicicletaPolicia)b).ID);
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nTipo de Polícia: " + this.tipo.toString() +
				"\nID: " + this.ID;
	}
}
