package aula05.Ex2;

public class MotoPolicia extends Moto implements Policia {
	Tipo tipo;
	String ID;
	
	public MotoPolicia(int ano, String cor, int nRodas, int cc, int potencia, 
					   int velMax, int consumo, String combustivel, String matricula, 
					   String tipoMoto, String tipoPolicia, String ID) {
		
		super(ano, cor, nRodas, cc, potencia, velMax, consumo, combustivel, matricula, tipoMoto);
		
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
		return super.equals(b) && tipo.equals(((MotoPolicia)b).tipo) && ID.equals(((MotoPolicia)b).ID);
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nTipo de Polícia: " + this.tipo.toString() + "\nID: " + this.ID;
	}
}