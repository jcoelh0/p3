package aula12.Ex3;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public int dia(){
		return this.dia;
	}
	public int mes(){
		return this.mes;
	}
	public int ano(){
		return this.ano;
	}
	
	public static boolean bissexto(int ano){
		return (ano%400 == 0 || (ano%4 == 0 && ano%100 != 0));
	}
	
	public static int nDias(int a, int b){
		switch(b){
			case 1:  return 31;
			case 2:
				if(bissexto(a))
					 return 29;
				else
					 return 28;
			case 3:  return 31; 
			case 4:  return 30;
			case 5:  return 31;
			case 6:  return 30;
			case 7:  return 31;
			case 8:  return 31;
			case 9:  return 30;
			case 10: return 31;
			case 11: return 30;
			case 12: return 31;
		}
		return 0;
	}
	  
	public static boolean dataValida(int dia, int mes, int ano){
		if(ano < 1900){
			return false;
		}else if(mes > 12 || mes < 1){
			return false;
		}else if(dia>nDias(ano, mes) || dia<1){
			return false;
		}else{ 
			return true;
		}
	}
	
	public String toString(){
		return this.dia + "/" + this.mes + "/" + this.ano; 
	}
	
}