package aula05.Ex2;

public class Moto extends Motorizado{
	
	private enum Tipo{
		Scooter, Desportiva, Custom, Chopper, TT, Street, Underbone, Normal
	};
	private Tipo tipo;

	public Moto(int ano, String cor, int nRodas, int cc, int potencia, int velMax, 
			double consumo, String combustivel, String matricula, String tipo) {
		
		super(ano, cor, nRodas, cc, potencia, velMax, consumo, combustivel, matricula);
		
		this.tipo = Tipo.valueOf(tipo);

	}

	@Override
	public boolean equals(Object b) {
		return super.equals(b) && tipo.equals(((Moto) b).tipo);
	}

	@Override
	public String toString() {
		return super.toString() + "\nTipo de moto: " + tipo.toString();
	}
}
