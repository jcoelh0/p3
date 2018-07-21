package aula10.Ex1;

public interface MyIterator<T> {
	boolean hasNext();
	T next();
	void remove();
}