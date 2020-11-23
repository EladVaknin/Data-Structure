package LinkedList;

public class DLLNode {   
	private int data ;
	private DLLNode next , prev ;
	
	public DLLNode (int data) { // constructor
		this.data = data ;
		next = prev =null ;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DLLNode getNext() {
		return next;
	}
	public void setNext(DLLNode next) {
		this.next = next;
	}
	public DLLNode getPrev() {
		return prev;
	}
	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}

}
