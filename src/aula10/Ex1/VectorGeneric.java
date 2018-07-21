package aula10.Ex1;

import aula01.Ex2.Pessoa;

public class VectorGeneric<T> {
	private T[] list;
	private int nPessoas;
	private final int ALLOC = 50;
	private int dimClasse = ALLOC;

	@SuppressWarnings("unchecked")
	public VectorGeneric() {
		list = (T[]) new Object[ALLOC];
		nPessoas = 0;
	}

	@SuppressWarnings("unchecked")
	public boolean addElem(T elem) {

		if (elem == null)
			return false;

		if (nPessoas >= dimClasse) {
			dimClasse += ALLOC;
			Pessoa[] newArray = new Pessoa[dimClasse];
			System.arraycopy(list, 0, newArray, 0, nPessoas);
			list = (T[]) newArray;
		}

		list[nPessoas++] = elem;
		return true;

	}

	public boolean removeElem(T elem) {

		for (int i = 0; i < nPessoas; i++) {

			if (list[i] == elem) {
				nPessoas--;
				for (int j = i; j < nPessoas; j++)
					list[j] = list[j + 1];
				return true;
			}
		}

		return false;

	}

	public int totalElem() {
		return nPessoas;
	}

	public T getList(int i) {
		return list[i];
	}

	MyIterator<T> iterator() {
		return (this).new VectorIterator<T>();
	}

	BFIterator<T> iteratorBF() {
		return (this).new VectorBFIterator<T>();
	}

	@Override
	public String toString() {

		String s = "";

		for (int i = 0; i < nPessoas; i++) {
			s += "\n" + getList(i);
		}

		return s;
	}

	@SuppressWarnings("hiding")
	private class VectorIterator<T> implements MyIterator<T> {

		private int indice;

		VectorIterator() {
			indice = 0;
		}

		public boolean hasNext() {
			return (indice < nPessoas);
		}

		public T next() {

			if (hasNext()) {
				@SuppressWarnings("unchecked")
				T r = (T) list[indice];
				indice++;
				return r;
			}

			throw new IndexOutOfBoundsException("only " + nPessoas + " elements");

		}

		public void remove() {
			throw new UnsupportedOperationException("Operação não suportada!");
		}

	}

	@SuppressWarnings("hiding")
	private class VectorBFIterator<T> implements BFIterator<T> {

		private int indice;

		VectorBFIterator() {
			this.indice = 0;
		}

		public boolean hasNext() {
			return (indice < nPessoas);
		}

		public boolean hasPrevious() {
			return (indice > nPessoas);
		}

		public T next() {

			if (hasNext()) {
				@SuppressWarnings("unchecked")
				T r = (T) list[indice];
				indice++;
				return r;
			}

			throw new IndexOutOfBoundsException("only " + nPessoas + " elements");

		}

		public T previous() {

			if (hasPrevious()) {
				@SuppressWarnings("unchecked")
				T r = (T) list[indice];
				indice--;
				return r;
			}

			throw new IndexOutOfBoundsException("only " + nPessoas + " elements");

		}

	}
}
