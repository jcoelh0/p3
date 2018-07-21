package aula05.Ex1;

public class UtilCompare {

	public static void sortArray(Comparable[] lista) {
		for (int i = 0; i < lista.length - 1; i++) {
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[i].compareTo(lista[j]) > 0) {
					Comparable tmp = lista[i];
					lista[i] = lista[j];
					lista[j] = tmp;
				}
			}
		}
	}

	public static Comparable findMax(Comparable[] lista) {
		int max = 0;
		for (int i = 0; i < lista.length - 1; i++) {
			if (lista[i].compareTo(lista[i + 1]) < 0) {
				max = i + 1;
			}
		}

		return lista[max];
	}

}
