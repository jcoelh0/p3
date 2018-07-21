package aula10.Ex2;

import java.util.Iterator;
import java.util.Stack;
import java.lang.Comparable;

public class BinarySearchTree<T extends Comparable<? super T>> implements Iterable<T> {
	// o elemento do tipo T deve ser comparável para efectuar pesquisas
	// mas como pode herdar a implementação de compareTo() é mais correcto
	// usar <? super T>
	
	//left is less//right is more
	private static class BSTNode<T> {
		T element;
		BSTNode<T> left;
		BSTNode<T> right;

		BSTNode(T theElement) {
			element = theElement;
			left = right = null;
		}
	}

	private BSTNode<T> root;
	private int numNodes;

	public BinarySearchTree() {
		root = null;
		numNodes = 0;
	}

	public void insert(T value) {
		BSTNode<T> v1 = new BSTNode<T>(value);
		root = insert(v1, root);
	}
	
	private BSTNode<T> insert(BSTNode<T> value, BSTNode<T> root) {
		
		if(root==null){
			numNodes++;
			return root = value;
		}
		else if(value.element.compareTo(root.element) <= 0 && root.left == null){
			numNodes++;
			return root.left = value;
		}
		else if(value.element.compareTo(root.element) <= 0)
			return insert(value, root.left);
		else if(value.element.compareTo(root.element) > 0 && root.right == null){
			numNodes++;
			return root.right = value;
		}
		else if(value.element.compareTo(root.element) > 0)
			insert(value, root.right);
		
		return root;
	
	}

	public void remove(T value) {
		BSTNode<T> v1 = new BSTNode<T>(value);
		root = remove(v1, root);
	}
	
	private BSTNode<T> remove(BSTNode<T> value, BSTNode<T> root){
		
		if(root==null){
			return null;
		}else if(value.element.compareTo(root.element) > 0){
			root.right = remove(value,root.right);
		}else if(value.element.compareTo(root.element) < 0){
			root.left = remove(value,root.left);
		}else if(value.element.equals(root.element)){
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			else
				return insert(root.left,root.right);
		}
		return root;
	}

	public boolean contains(T value) {
		return valueOf(find(value, root)) != null;
	}

	private BSTNode<T> find(T value, BSTNode<T> root2) {
		if(root2 != null && root2.element.equals(value)){
			return root2;
		}else if(root2 != null && !root2.element.equals(value)){
			if(root2.left != null && root2.left.element.compareTo(value) <= 0){
				return find(value, root2.left);
			}
			else if(root2.right != null && root2.right.element.compareTo(value) > 0){
				return find(value, root2.right);
			}
		}		
		return null;
	}
	
	private T valueOf(BSTNode<T> find) {
		if(find == null)
			return null;
		return find.element;
	}

	@Override
	public Iterator<T> iterator() {
		return new BSTiterator();
	}

	private class BSTiterator implements Iterator<T>{
		Stack<BSTNode<T>> stack = new Stack<BSTNode<T>>();
		BSTNode<T> atual;
		
		public BSTiterator(){
			atual = stack.peek();
		}
		
		@Override
		public boolean hasNext(){
			return stack.size() != 0;
		}
		
		@Override
		public T next(){
			atual = stack.peek();
			return valueOf(stack.pop());
		}
		@Override
		public void remove(){
			BinarySearchTree.this.remove(atual, root);
			stack.remove(atual);
			atual = stack.peek();
		}
	}
}
