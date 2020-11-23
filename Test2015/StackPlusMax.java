package Test2015;

public class StackPlusMax {
	int size ;
	Node head;
	int max=0;
	
	public StackPlusMax (int size) {
		int [] arr = new int [size];
	}
	public void push(int data) {  // to input a value into the list and the new input will be the head
		Node p = new Node (data);
		if (size == 0) {           // check if the stack is empty
			head = new Node (data);
			size ++ ;
			max=data;
		}else {
			p.next=head;
			head = p;
			size++;
			if(p.data>max) {
				max= p.data;
			}
			}
		}
	
	public int pop(){
		if (size == 0) { // if the stack is empty
			return -1;
		}else {
			int tmp = head.data;
			head = head.next;
			return tmp;
		}
	}
	public int max(){
		if (size == 0) { // if the stack is empty
			return -1;
		}else return max;
	}
	public String toString(){
		String st = " " ;
		Node p = new Node () ;
		p = head;
		while (size > 0) {
		        st = st + p.data;
		        p =p.next;
		        size --;
		}return st;
	}
}
