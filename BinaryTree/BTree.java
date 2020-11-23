package BinaryTree;

public class BTree<T> {
	Node <T> root ;
    int size ;
    public BTree () {            // Default constractur - to bilding a empty tree
    	this.root =null;
    	size =0;
    }
    public void addIterative (T data) {           // Add method
    	boolean Added = false ;     // to know if we success to adding or not 
    	if (root == null ) {          // to the case that the tree is empty
    		root = new Node <T> (data) ;   // we create a new node and give hem the data
    		size ++ ;                         
    		Added = true ;                 // we successes to add a root
    	}
    	Node p =root ;             // for the case that the tree is not empty , we will scan the tree whit the condions 
    	while (!Added) {  // if we not success to add a node
    		if(Math.random()>0.5) {      // we go right
    			if (p.right == null) {          // if right is empty
    				p.right = new Node <T> (data);
    				size ++;
    				Added =true;
    			}else {   // if right is full
    				p = p.right;
    			}
    		}else {                  // we go left
    			if (p.left == null) {          // if left is empty
    				p.left = new Node <T> (data);
    				size ++;
    				Added =true;
    			}else {   // if left is full
    				p = p.left;
    			}
    		}
    	}
    }
    public void addRecursive (T data) {                   // to do the add method in recursia
    	if (root == null) {           // if its empty tree
    		root = new Node <T> (data);
    		size ++ ;
    		return;
    	}
    	addRecursive (data,root) ;     // 
    }
	private void addRecursive(T data, Node<T> curr) {
	 if (Math.random() > 0.5) {
		 if (curr.right==null) {
			 curr.right=new Node <T> (data);
			 size ++;
			 return;
		 }
		 addRecursive (data,curr.right) ;      // make its another time.. do it another time
	 }else {                                    // for the case that we go left
		 if (curr.left==null) {
			 curr.left=new Node <T> (data);
			 size ++;
			 return;
		 }
		 addRecursive (data,curr.left) ; 
	}
	}
	public void in_Order () {
		in_Order(root);
	}
	private void in_Order(Node<T> curr) {
		 if(curr!= null) {
			 in_Order(curr.left);
			 System.out.println(curr + " ");
			 in_Order (curr.right);
		 }
		
	}
}
