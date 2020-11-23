package BinarySearchTree;

public class Node {
    int data ;
     Node left ,right ;
     public Node (int data) {
    	 this.data = data ;
    	 right =left = null;
     }
     public String toString () {
    	 return "" +data ;
     }
}
