package aula10.Ex1;

public interface BFIterator<T> {

	boolean hasPrevious();
	T previous();
	boolean hasNext();
	T next();
	
}