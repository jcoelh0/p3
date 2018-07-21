package aula08.Ex1;

public class JogoDoGaloEngine {
	
	protected JogoDoGalo jogo;
	private int[][] jogada;
	private int nJogadas = 0;
	protected int jogador;
	protected int[] soma = new int[8];
	
	public JogoDoGaloEngine(JogoDoGalo jogoDoGalo) {
        this.jogo = jogoDoGalo;
    }
	
	public JogoDoGaloEngine(){
		jogada = new int[3][3];
		
		for (int i = 0; i < jogada.length; i++)
			for (int j = 0; j < jogada[i].length; j++)
				jogada[i][j] = 0;				
		
		this.nJogadas = 0;
		this.jogador = 1;
	}
	
	public boolean valida(int i, int j){
		return (i >= 1) && (i < 4) && (j >= 1) && (j < 4);
	}
	
	public boolean vazia(int i, int j){
		if(!valida(i, j))
			return false;
	    return jogada[i-1][j-1] == 0;
	}

	public boolean jogadorX() {
		return jogador == 1;
	}

	public int nJogadas() {
		return nJogadas;
	}
	
	public void set(int i,int j,int jogador){
		jogada[(i - 1)][(j - 1)] = jogador;
		this.nJogadas++;
		if(finished() || vencedor()==1 || vencedor()==-1){
	    	throw new JogoTerminado();
	    }
	}
	public int resultado() {
        assert (this.finished());
        int n = 0;
        for (int i = 0; n == 0 && i < 8; ++i) {
            if (this.soma[i] == 3) {
                n = 1;
                continue;
            }
            if (this.soma[i] != -3) continue;
            n = -1;
        }
        return n;
    }

	private boolean finished() {
		boolean bl = (this.nJogadas == 9);
        for (int i = 0; !bl && i < 8; ++i) {
            bl = Math.abs(this.soma[i]) == 3;
        }
        return bl;
	}
	
	
	public int vencedor() {
		
		for(int i = 0; i<jogada.length; i++){
			if((jogada[i][0]+jogada[i][1]+jogada[i][2])==3){
				return 1;
			}else if((jogada[i][0]+jogada[i][1]+jogada[i][2])==-3){
				return -1;
			}
		}
		
		for (int j = 0; j < jogada.length; j++) {
			if((jogada[0][j]+jogada[1][j]+jogada[2][j])==3){
				return 1;
			}else if((jogada[0][j]+jogada[1][j]+jogada[2][j])==-3){
				return -1;
			}
		}
		
		if(jogada[0][0]+jogada[1][1]+jogada[2][2]==3){
			return 1;
		}else if(jogada[0][0]+jogada[1][1]+jogada[2][2]==-3){
			return -1;
		}else if(jogada[0][2]+jogada[1][1]+jogada[2][0]==3){
			return 1;
		}else if(jogada[0][2]+jogada[1][1]+jogada[2][0]==-3){
			return -1;
		}
		
		if(finished())
			return 0;
		else
			return 2;
		
	}
	
	public class JogoTerminado extends RuntimeException{	
		private static final long serialVersionUID = 1L;
	};
}
