package aula05.Ex2;

public class CarroPolicia extends Automovel implements Policia{

	Tipo tipo;
	String ID;

	public CarroPolicia(int ano, String cor, int nRodas, int cc, int potencia, int velMax,
			double consumo,String marca,String combustivel,String matricula,String tipoCar,
			String tipoPolicia,String ID) {
			
		super(ano, cor, nRodas, cc, potencia, velMax, consumo, marca, combustivel, matricula, tipoCar);
		
		this.tipo = Tipo.valueOf(tipoPolicia);
		setID(ID);
	}

	@Override
	public String getTipo() {
		return tipo.toString();
	}

	@Override
	public String getID() {
		return ID;
	}

	@Override
	public void setID(String ID) {
		this.ID = ID;
	}
	
	@Override
	public boolean equals(Object b){
		return super.equals(b) && tipo.equals(((CarroPolicia)b).tipo) && 
				ID.equals(((CarroPolicia)b).ID);
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nTipo de Polícia: " + this.tipo.toString() + 
				"\nID interno: " + this.ID;
	}
}
