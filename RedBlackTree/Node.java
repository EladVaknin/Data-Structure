package RedBlackTree;

public class Node {
int data;
Node left , right , parent ;
boolean isBlack;          // boolean vale that say to me if its black or red    
boolean isLeftChild;       // boolean vale that say to me if its left or right child
public Node (int data) {
	this.data = data;
	left =right =parent =null;
	isBlack=isLeftChild=false;
	
}
}
