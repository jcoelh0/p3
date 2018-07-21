package aula11.Ex1.A;

public class ListaGeneric<T> {

	private Node top = null;		// Nota mais abaixo na private class VectorIterator<T> 
	private Node head = null;
	private int size = 0;

	private class Node {
		
		private Node next;
		private Node prev;
		private T elem;
	
		public Node(T elem) {
			this.elem = elem;
		}
	
	}
	
	public void addElem(T elem) {
		
		Node n = new Node(elem);
		
		if (head == null)
			head = n;
		
		if (top == null){
			top = n;
		}
			
		else{
			n.prev = top;
			top.next = n;
			top = n;
		}
			
		size++;
	
	}
	public boolean removeElem(T elem) {
		
		Node tmp = top;
		
		if(top.elem.equals(elem) && top.next==null){
			top = null;
			size--;
			return true;
		}
		
		else if(top.elem.equals(elem) && top.next!=null){
			top = top.next;
			size--;
			return true;
		}
		
		while(tmp.next != null){
			if(tmp.next.elem.equals(elem)){
				tmp.next = tmp.next.next;
				size--;
				return true;
			}
			tmp = tmp.next;
		}
		
		return false;
	
	}
	MyIterator<T> iterator() {
		return (this).new VectorIterator<T>();
	}
	
	BFIterator<T> iteratorBF() {
		return (this).new VectorBFIterator<T>();
	}
	
	@SuppressWarnings("hiding")
	private class VectorIterator<T> implements MyIterator<T> {
	
		Node tmp = null;
		
		public VectorIterator(){
			tmp = head;
		}
		
		public boolean hasNext(){
			return (tmp != null);
		}

		public T next(){
			@SuppressWarnings("unchecked")
			T p = (T) tmp.elem;
			tmp = tmp.next;
			return p;
		}

		public void remove(){		// Antes tinha T em todos os Nodes (Node<T>...) mas dava erro
			removeElem(tmp.elem);   // nesta instrução, então tirei os T dos Nodes
		}
	}
	
	@SuppressWarnings("hiding")
	private class VectorBFIterator<T> implements BFIterator<T> {

		Node tmp = null;
		
		public VectorBFIterator(){
			tmp = head;
		}
		
		public boolean hasNext(){
			return (tmp.next != null);
		}

		public boolean hasPrevious() {
			return (tmp.prev != null);
		}
		
		public T next(){
			@SuppressWarnings("unchecked")
			T p = (T) tmp.elem;
			tmp = tmp.next;
			return p;
		}
		
		public T previous() {
			@SuppressWarnings("unchecked")
			T p = (T) tmp.elem;
			tmp = tmp.prev;
			return p;
		}
		
	}
}
