package aula03.Ex3;

public class Veiculo {
	private int cc;
	private int potencia;
	private int lotacao;
	private char tipo;
	private int peso;

	public Veiculo(int cc, int potencia, int lotacao, char tipo, int peso) {
		this.cc = cc;
		this.potencia = potencia;
		this.lotacao = lotacao;
		this.tipo = tipo;
		this.peso = peso;
	}

	public int getCc() {
		return cc;
	}

	public int getPotencia() {
		return potencia;
	}

	public int getLotacao() {
		return lotacao;
	}

	public char getTipo() {
		return tipo;
	}

	public int getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Veículo: " + getClass().getSimpleName() + "\nCilindrada:" + cc + ", potência:" + potencia + ", Lotação:" 
				+ lotacao + ", Tipo de Carta:" + tipo + ", peso:" + peso;
	}
}
