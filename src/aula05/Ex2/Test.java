package aula05.Ex2;

import aula05.Ex1.Comparable;
import aula05.Ex1.UtilCompare;

public class Test {
	public static void main(String[] args) {
		Veiculo garagem[] = {
				new Automovel(1994, "Branco", 5, 1400, 90, 180, 7.5, "Honda", 
						"Gasolina", "34-LO-76", "Normal"),
				
				new Bicicleta(1999, "Preto", 2, "Estrada"),
				new BicicletaPolicia(1780, "Azul", 1, "BMX", "PJ", "SFLJKUIA"),
				
				new CarroPolicia(2015, "Laranja", 4, 2511, 170, 250, 8, "Lexus", 
						"Gasoleo", "31-GNR-14", "Desportivo","PSP", "ABNMLGF2"),
				
				new Moto(1980, "Branco", 2, 830, 83, 310, 5, "Gasolina", "AB-22-22", "Street"), 
				
				new MotoPolicia(2005,"Azul", 2, 900, 88, 300, 20, "Gasolina", "KL-32-PSP", 
						"Desportiva", "PSP", "OWEQHAD2") };

	
		System.out.println("-----\n" + UtilCompare.findMax(garagem));

		UtilCompare.sortArray(garagem);

		for (Comparable a : garagem) {
			System.out.println("-----\n" + a);
		}
		
	}
}
