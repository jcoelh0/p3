package aula11.Ex1.A;

public interface BFIterator<T> {

	boolean hasPrevious();
	T previous();
	boolean hasNext();
	T next();
	
}