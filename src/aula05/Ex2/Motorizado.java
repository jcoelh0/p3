package aula05.Ex2;

public class Motorizado extends Veiculo{
	
	private enum Combustivel{
		Gasoleo, Gasolina, GPL
	};
	
	private String matricula;
	private int cc;
	private int velMax;
	private int potencia;
	private double consumo;
	private Combustivel combustivel;
	
	
	public Motorizado(int ano, String cor, int nRodas, int cilindrada, int potencia, int velMax, 
					  double consumo, String combustivel, String matricula) {
		
		super(ano, cor, nRodas);
		cc = cilindrada;
		this.potencia = potencia;
		this.velMax = velMax;
		this.consumo = consumo;
		this.combustivel = Combustivel.valueOf(combustivel);
		this.matricula = matricula;
	}


	public String getMatricula() {
		return matricula;
	}


	public int getCc() {
		return cc;
	}


	public int getVelMax() {
		return velMax;
	}


	public int getPotencia() {
		return potencia;
	}


	public double getConsumo() {
		return consumo;
	}


	public String getCombustivel() {
		return combustivel.toString();
	}
	
	@Override 
	public boolean equals(Object b){
    	return super.equals(b) && cc == ((Motorizado)b).cc && potencia == ((Motorizado)b).potencia && 
    			velMax == ((Motorizado)b).velMax && consumo == ((Motorizado)b).consumo && 
    			combustivel.equals(((Motorizado)b).combustivel) && 
    			matricula.equals(((Motorizado)b).matricula);
    }
    
    @Override 
    public String toString(){
    	return super.toString() + "\nCilindrada: " + cc + "\nPot�?encia: " + potencia + 
    			"\nVelocidade máxima: " + velMax + "\nConsumo: " + consumo + "\nCombustível: " +
    			combustivel.toString() + "\nMatrícula: " + matricula;
    }
}
