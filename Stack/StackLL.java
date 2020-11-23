package Stack;

public class StackLL<T> {
	Node <T> top ;
	int size ;
	
public StackLL () {        
	top = null;
	size = 0;
}
public void Push (T data) {        
	Node <T> p = new Node <T> (data,this.top) ;
	top = p;
	size ++;
}
public T Pop() {
	if (top != null ) {
		T tmp = top.data;
		top = top.next;
		size--;
		return tmp;
	}
	return null;
}
public T Top () {
	return (top != null) ? top.data : null;    // ? = if , : = else . 
}
public String toString () {
	return MYtoString(top) ;
}
private String MYtoString(Node<T> p) {
	if (p == null) {
		return "-|" ;
	}
	return MYtoString (p.next) + " " + p.data ;
}
}
