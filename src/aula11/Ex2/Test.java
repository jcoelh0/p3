package aula11.Ex2;

import java.util.List;

public class Test {
	@SuppressWarnings("unused")
	private static Figura maiorFiguraJ7(List<Figura> figs) {
		
		Figura[] maior = new Figura[1];	
		maior[0] = figs.get(0);
		
		figs.forEach(f -> {
			if(f.compareTo(maior[0]) > 1) 
				maior[0] = f;
		} );
		return maior[0];
	}
	
	//Reimplemente a alínea a) mas utilizando agora o perímetro como elemento de
	//comparação (isto sem mexer na implementação de Figura).
	
	@SuppressWarnings("unused")
	private static double maiorPerimetroFiguraJ7(List<Figura> figs) {
		
		double maior[] = new double[1];
		maior[0] = figs.get(0).perimetro();
		
		figs.forEach(f -> {
			if((f).compareTo(maior[0]) > 1) 
				maior[0] = f.perimetro();
		} );
	
		return maior[0];
	}
	
	@SuppressWarnings("unused")
	private static double areaTotalJ8(List<Figura> figs) {
		double sum = figs.stream()
					  	 .mapToDouble(Figura::area)
					  	 .sum();
		return sum;
	}
	
	
	
	//private static double areaTotalJ8(List<Figura> figs, String subtipoNome){
		//double sum = figs.stream()
		//			  	 .mapToInt(Figura::area)
		//			  	 .sum()
		//			  	 .forEach(subtipoNome::figs);
		
		//return sum;
	//}
}
