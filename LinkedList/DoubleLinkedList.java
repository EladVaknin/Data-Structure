package LinkedList;

public class DoubleLinkedList {
    DLLNode head ,tail ;
    int size ;
    public DoubleLinkedList () {      // Constructor
    	head = tail =null ;
    	size = 0;
    }
    public void Add (int data) {  
    	if (size == 0) {           // if the list is empty
    		head = new DLLNode (data) ; // create a new Node
    		tail = head ;
    		size =1 ;
    	}else {                  // if the list not empty
    		DLLNode newNode = new DLLNode (data) ;     // create a new Node
    		tail.setNext(newNode);   // we moving the the next pointer of the tail , the tail swap to the newNode.
    		newNode.setPrev(tail);   // swap between the perv of the newNode to the tail.
    		tail = newNode;
    		size ++ ;
    	}
    }
    public void Remove (int data) {
    	if (size == 0) return ;      // if the list is empty
    	if (size == 1 && head.getData() == data) {   // if in the list we have only one Node
    		head = tail =null ;
    		size = 0;
    		return;
    	}
    	if (head.getData() == data ) {    // in the case that what i want to remove it is the head.
    		head = head.getNext();
    		head.setPrev(null);
    		size -- ;
    		return;
    	}
    	if(tail.getData() == data ) {   // in the case that what we want to remove is the tail.
    		tail = tail.getPrev();
    		tail.setNext(null);
    		size--;
    		return;
    	}
    	DLLNode p = head ; // create a pointer
    	while (p != null && p.getData() != data) {
    		p=p.getNext();
    	}
    	if (p != null) {
    		p.getPrev().setNext(p.getNext()); 
    		p.getNext().setPrev(p.getPrev());
    		size -- ;
    	}
    }
}
