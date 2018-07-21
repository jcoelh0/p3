package aula01.Ex3;

public class Retangulo {
	private int comp;
	private int larg;
	
		public Retangulo(int comp, int larg){
			this.comp=comp;
			this.larg=larg;
			
		}
		public int comp(){
			return comp;
		}
		public int larg(){
			return larg;
			
		}
		
		public int area() {
	        return comp*larg;
	    }
	 
	    public int perimetro() {
	        return comp*2 + larg*2;
	    }
	    public String toString() {
	        return "Ã�rea: " + area() + "Perimetro: " + perimetro() + "comprimento: " + comp() + "largura:"+larg();
	    }

}
