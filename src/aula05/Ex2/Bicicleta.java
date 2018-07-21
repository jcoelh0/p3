package aula05.Ex2;

public class Bicicleta extends Veiculo {
	private enum Tipo {
		BTT, Estrada, Urbana, BMX, Infantil, Normal
	};

	private Tipo tipo;

	public Bicicleta(int ano, String corBase, int numRodas, String tipo) {
		super(ano, corBase, numRodas);

		this.tipo = Tipo.valueOf(tipo);
		
	}

	@Override
	public boolean equals(Object b) {
		return super.equals(b) && tipo.equals(((Bicicleta) b).tipo);
	}

	@Override
	public String toString() {
		return super.toString() + "\nTipo de bicicleta: " + tipo.toString();
	}
}
