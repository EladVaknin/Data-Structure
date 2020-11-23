package LinkedList;

public class CycledLL {
	Node head , tail ;
	int size ;

	public CycledLL () {   // default constructor 
		head =tail = null;
		size = 0;
	}
	public void Add (int data) {
		if (size == 0) {  // if the list is empty
			head= new Node (data,null);  // we create a new Node
			tail =head; 
			head.setNext(tail);
			size = 1;
		}else{
			Node newNode = new Node (data ,head) ;   // creat a new Node and else next we putting head in the pointer 
			tail.setNext(newNode);
			tail = newNode;
			size ++ ;
		}
	}
	public void Remove (int data ) {
		if (size == 0) return ;
		if (size == 1 && (head.getData()==data)) {     // for the case that what we want to remove is the head.
			size = 0;
			head =tail = null;
			return ;
		}
		if (head.getData() == data ) {
			head = head.getNext();
			tail.setNext(head);
			size -- ;
			return ;
		}
		else if (tail.getData() == data ) {        // to remove the tail
			Node p = head ;            // create a pointer Node
			while (p.getNext() != tail) {      // if its not tail move next
				p=p.getNext();    
			}
			tail =p ;
			tail.setNext(tail.getNext().getNext());      //swap the pointers
			size -- ;
			return;
		}
		Node curr , prev ;                // to the case that we want to remove in the middle
		prev = null;
		curr = head;
		while(curr != tail && curr.getData() != data ) {
			prev =curr;
			curr = curr.getNext();
		}
		if(curr != tail) {
			prev.setNext(curr.getNext());
			size -- ;
		}
	}
	public String toString () {
		if (size == 0) 
			return " -> null" ;
		Node p = head ; 
		String st = "->";
		while (p.getNext() != head) {
			st += p.getData() + "->" ; 
			p =p.getNext();
		}
		st += p.getData()+" -> null" ;
		return st;
	} 
}
