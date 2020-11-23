package Test2019;

public class Node {
	Object data;
	Integer key;
	Node right ,left ,head;
	public Node (Integer key, Object data) {
		this.data = data;
		this.key= key;
		right= left=head=null;
	}
	
}
