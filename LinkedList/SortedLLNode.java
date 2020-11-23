package LinkedList;

public class SortedLLNode {
private double data ;
private SortedLLNode next ; 
public SortedLLNode (double data ,SortedLLNode next ) {
	this.data = data ;
	this.next = next ; 
}
public double getData() {
	return data;
}
public void setData(double data) {
	this.data = data;
}
public SortedLLNode getNext() {
	return next;
}
public void setNext(SortedLLNode next) {
	this.next = next;
}

}
