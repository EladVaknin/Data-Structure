package BinaryTree;

public class Node<T> {
	T data;
	Node right , left ;

	public Node (T data) {     // constructor
		this.data = data ;
		right = left = null;
	}
	public String toString () {
		return " "+ data ;
	}
}
