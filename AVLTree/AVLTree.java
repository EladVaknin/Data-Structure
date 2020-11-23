package AVLTree;

public class AVLTree {
	Node root;
	int size ;
	public AVLTree () {     // empty tree
		root = null ;
		size =0;
	}
	public int height (Node n) {       // this method get kodkod and return ther heights
		if (n==null) 
			return -1;
		return 1+Math.max(height(n.left),height(n.right));
	}
	// rotations :
	public Node LeftRotation (Node n) {       // to solve a right right 
		Node tmp = n.right;           // 1 
		tmp.parent = n.parent;         
		n.right=tmp.left;       // 2 
		if (n.right != null) {
			n.right.parent = n;
		}
		tmp.left = n;          // 3 
		if (tmp.parent != null) {
			if (n.parent.right ==n) {
				tmp.parent.right = tmp;
			}else {
				tmp.parent.left = tmp ; 
			}
		}
		return tmp ; // 4 
	}
	public Node RightRotation (Node n) {      // to sole a left left 
		Node tmp = n.left;
		tmp.parent = n.parent;
		n.left = tmp.right;
		if(n.left != null)
			n.left.parent=n;
		tmp.right =n;
		n.parent=tmp;
		if(tmp.parent != null) {
			if(tmp.parent.right == n) {
				tmp.parent.right = tmp;
			}else {
				tmp.parent.left = tmp;
			}
		}
		return tmp;
	}
	public Node RightLeftRotation (Node n) {
		n.right=RightRotation(n.right) ;
		return LeftRotation (n);
	}
	public Node LeftRightRotation (Node n) {
		n.left=LeftRotation(n.left) ;
		return RightRotation (n);
	}
	public void Add (int data) {
		Node newNode = new Node (data);
		if(root == null) {            // if the tree is empty
			root = newNode;
			size ++ ;
			return ;
		}
		add (newNode,root);      //  add in recursia
		CheckBalance(newNode) ; // to cheking the balance of the tree
	}

	private void add(Node newNode, Node parent) {
		if(newNode.data > parent.data) {              // we go right
			if(parent.right == null) {       // if right is empty
				parent.right = newNode;
				newNode.parent = parent;
				size++;
				return;
			}else {
				add(newNode,parent.right);      //else we add to right in recursia

			}
		}else {                          // if we dont go right
			if (parent.left == null) {        // if the left side is empty
				parent.left = newNode;
				newNode.parent = parent;
				size++;
				return;
			}else {          // else - if its not empty - add in recursia to the left side
				add(newNode,parent.left);
			}
		}	
	}
	private void CheckBalance(Node n) {             // chek if we have a problam or not
		int diff = (height(n.left))-(height(n.right)) ;      // is the difreentr between the subtree's
		if(diff > 1 || diff<-1) {
			rebalance(n);
		}
		if(n.parent==null)
			return;
		CheckBalance (n.parent);
	}
	
	private void rebalance(Node n) {          // this method fix the problam that we got after the checkbalnce
		int diff = (height(n.left))-(height(n.right)) ;      // is the difreentr between the subtree's
		if (diff>1) {            // the problam its in the left side
			 if(height(n.left.left)>height(n.left.right)) {
				 n=RightRotation(n);
			 }else {
				 n=LeftRightRotation(n); 
			 }
		}else {
			 if(height(n.right.left)>height(n.right.right)) {
				 n= RightLeftRotation(n);
			 }else {
				 n=LeftRotation (n) ;
			 }
		}
          if(n.parent == null) {
        	  root =n;
          }
	}
}
