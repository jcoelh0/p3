package aula03.Ex3;

import java.util.Scanner;

public class Test {
	static Scanner read = new Scanner (System.in);
	
	public static void main(String[] args){
		//int cc, int potencia, int lotacao, char tipo, int peso
		
		Ligeiro nissan = new Ligeiro(1200, 98, 5, 'B', 500);
		Motociclo yamaha = new Motociclo(999, 110, 2, 'A', 250);
		PesadoMercadorias daf = new PesadoMercadorias(1800, 50, 20, 'C', 1000);
		PesadoPassageiros bus = new PesadoPassageiros(1600, 45, 30, 'D', 900);	
		System.out.println(nissan);	
		System.out.println(yamaha);
		System.out.println(daf);
		System.out.println(bus);
	
	}
}
