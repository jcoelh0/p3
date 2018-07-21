package aula05.Ex2;

public class Automovel extends Motorizado{
	
	private enum Tipo{
		Normal, Familiar, Comercial, Desportivo, Tunning, SuperCar, Conversivel, Jipe
	};
	
	private Tipo tipo;
	private String marca;
	
	public Automovel(int ano, String cor, int nRodas, int cilindrada,
			int potencia, int velMax, double consumo, String marca, String combustivel,
			String matricula, String tipo){
		
		super(ano, cor, nRodas, cilindrada, potencia, velMax, consumo, combustivel, matricula);
		this.marca = marca;
		this.tipo = Tipo.valueOf(tipo);
		
	}
	
	@Override
	public boolean equals(Object b){
		return super.equals(b) && tipo.equals(((Automovel)b).tipo);
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nMarca: " + marca + "\nTipo de automóvel: " + tipo.toString();
	}
}
