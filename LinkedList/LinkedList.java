package LinkedList;

public class LinkedList {
	public Node head; 
	int size ;     // the length of the list
	public LinkedList () {    //ampty 
		head = null ;
		size = 0 ;
	}
	public void AddLast (int data) {
		if (size == 0 ) {  // if the list is empty 
			head = new Node (data,null) ;
			size = 1 ;
		}else { 
			Node p = head ;  // the pointer 
			while (p.getNext() != null ) {   // while the next is not null so move forward.
				p=p.getNext() ;
			}
			Node newNode = new Node (data,null);
			p.setNext(newNode);
			size++;
		}
	}
	public Node Remove (int data) {
		if (head.getData() == data ) { 
			Node tmp = head ; 
			head = head.getNext();    // we move the next
			size -- ;
			return tmp ;
		}
		Node p = head ; 
		while (p.getNext() != null && p.getNext().getData() != data ) {  // we have tow condicions - 1 = we are in the range of the list ,2 = my next its not what i want to remove .
			p=p.getNext();  // move next.
		}
		if (p.getNext() != null ) {
			Node tmp = p.getNext() ;
			p.setNext(p.getNext().getNext());
			size -- ;
			return tmp;
		}
		return null;
	}
	public void RemoveAllOccurences (int data) {  // for the case that we want to remove all the same value .
		Node p = Remove (data);
		while (p != null) {
			p = Remove (data) ;
		}
	}
	
public String toString () {
	if (size == 0) 
		return " -> null" ;
	Node p = head ; 
	String st = "->";
	while (p.getNext() != null) {
		st += p.getData() + "->" ; 
		p =p.getNext();
	}
	st += p.getData()+" -> null" ;
	return st;
}
}
