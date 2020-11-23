package Test2015;

public class Node {     // <T> = generi class - integer , boolean,long,double.. accept all the kinds of values
	int data ;
	Node next ;
	public Node (int data) {          // constructor
		this.data = data ;
		this.next = null ;
	
		
	}
	public Node () {          // constructor
		data =0;
		this.next =null;
	}
		
	public Node (int data , Node next)  {          // constructor whit next and max
		this.data = data ;
		this.next = next;
		
	}
	

}
