package LinkedList;

public class SortedLinkedList {    
	public SortedLLNode head ;
	int size ;
public SortedLinkedList () {    //empty list
	head = null;
	size = 0;
}
public void Add (double data) {   // to add a sorted node to the list
	SortedLLNode p = head ;
	if (p== null) {       // for the case that the list is empty
		head = new SortedLLNode (data,null);
		size = 1 ;
		return;
	}
	if (data < head.getData()) {          // if the data < from the head (the head is the first node)
		head = new SortedLLNode (data,head) ;  // creat new node that her next pointed in head.
		size ++ ;
		return;
	}
	while ((p.getData()<data) && (p.getNext()!= null) && (p.getNext().getData()<data)) {    // 
		p = p.getNext();
	}
	SortedLLNode newNode = new SortedLLNode (data,p.getNext());
	p.setNext(newNode);
	size ++ ;
}
public void Remove (double data) {
	if (head.getData()==data) {
		head = head.getNext();
				size -- ;
				return ;
	} else if (head.getData()>data) {
		return ;
	}
	SortedLLNode  curr , prev ;
	prev = null ;
	curr =head ;
	while (curr !=null && curr.getData() != data) {
		prev = curr;
		curr =curr.getNext();
	}
	if (curr !=null) {
		prev.setNext(curr.getNext());
		size -- ;
	}
}
public String toString () {
	if (size == 0) 
		return " -> null" ;
	SortedLLNode p = head ; 
	String st = "->";
	while (p.getNext() != null) {
		st += p.getData() + "->" ; 
		p =p.getNext();
	}
	st += p.getData()+" -> null" ;
	return st;
}
}
