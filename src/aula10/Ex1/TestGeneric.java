package aula10.Ex1;

import aula01.Ex2.*;
import aula04.Ex2.*;

public abstract class TestGeneric {
	public static void main(String[] args) {
		VectorGeneric<Pessoa> vp = new VectorGeneric<Pessoa>();
		for (int i = 0; i < 10; i++)
			vp.addElem(new Pessoa("Bebé no Vector " + i, 1000 + i, Data.today()));
		MyIterator<Pessoa> vec = vp.iterator();
		printSet(vp.iterator());
		ListaGeneric<Pessoa> lp = new ListaGeneric<Pessoa>();
		while (vec.hasNext())
			lp.addElem(vec.next());
		MyIterator<Pessoa> lista = lp.iterator();
		while (lista.hasNext())
			System.out.println(lista.next());
		ListaGeneric<Figura> figList = new ListaGeneric<Figura>();
		figList.addElem(new Circulo(1, 3, 1));
		figList.addElem(new Quadrado(3, 4, 2));
		figList.addElem(new Retangulo(1, 2, 2, 5));
		printSet(figList.iterator());
		System.out.println("Soma da Area de Lista de Figuras: " + sumArea(figList));
		// Partindo do principio que Quadrado extends Rectangulo:
		ListaGeneric<Retangulo> quadList = new ListaGeneric<Retangulo>();
		quadList.addElem(new Quadrado(3, 4, 2));
		quadList.addElem(new Retangulo(1, 2, 2, 5));
		System.out.println("Soma da Area de Lista de Quadrados: " + sumArea(quadList));
	}

	private static <T> double sumArea(ListaGeneric<T> figList) {
		MyIterator<T> iterator = figList.iterator();
		double sum = 0;
		
		while(iterator.hasNext()){
			sum += ((Figura)(iterator.next())).area();
		}
		return sum;
	}

	private static <T> void printSet(MyIterator<T> iterator) {
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}