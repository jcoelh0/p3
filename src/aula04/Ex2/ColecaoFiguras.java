package aula04.Ex2;

import java.util.ArrayList;


public class ColecaoFiguras {
	
	private double maxArea;
	private ArrayList<Figura> figuras = new ArrayList<Figura>();
	
	
	public ColecaoFiguras(double maxArea){// O construtor define a área máxima da
										  // coleção de figuras
		this.maxArea = maxArea;
	}
	 
	public boolean addFigura(Figura f){ // Adiciona uma figura à coleção
		if(figuras.contains(f) || areaTotal() + f.area() > maxArea){
			return false;
		}else{
			this.figuras.add(f);
			return true;
		}
		
		
	}
	public boolean delFigura(Figura f){ // Remove uma figura da coleção
		for (int j = 0; j < this.figuras.size(); j++)
			if(this.figuras.get(j).equals(f)){
				this.figuras.remove(f);
				return true;
			}
		return false;
	}
	public double areaTotal(){ // Retorna a área total das figuras
		double areaTotal = 0;
		for (int i = 0; i < this.figuras.size(); i++) {
			areaTotal += this.figuras.get(i).area();
		}
		
		return areaTotal;
	}
	public boolean exists(Figura f){ // Verifica se uma figura existe na coleção
		for (int i = 0; i < this.figuras.size(); i++) {
			if(this.figuras.get(i).equals(f))
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Área máxima:" + maxArea + ", figuras:" + figuras;
	}
	
	public Figura[] getFiguras(){ // Retorna uma lista com todas as figuras da coleção
		Figura[] figures = new Figura[this.figuras.size()];
		
		for(int i=0; i<this.figuras.size(); i++)
			figures[i] = this.figuras.get(i);
		
		return figures;
		
	}
	public Ponto[] getCentros(){ // Retorna uma lista com todos os centros
								 //das figuras da coleção
		
		Ponto[] centros = new Ponto[this.figuras.size()];
		
		for(int i=0; i<this.figuras.size(); i++)
			centros[i] = this.figuras.get(i).getPonto();
		
		return centros;
	}
}
