package Tests2017;

public class Node<T> {     // <T> = generi class - integer , boolean,long,double.. accept all the kinds of values
	T data ;
	Node next ;
	public Node (T data) {          // constructor
		this.data = data ;
		this.next = null ;
		
	}
	public Node (T data , Node next)  {          // constructor whit next
		this.data = data ;
		this.next = next;
	}
	

}
