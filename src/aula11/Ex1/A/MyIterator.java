package aula11.Ex1.A;

public interface MyIterator<T> {
	boolean hasNext();
	T next();
	void remove();
}