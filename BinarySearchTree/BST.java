package BinarySearchTree;

public class BST {
	Node root;
	int size ;
	public BST () {               // default constructor
		root = null;
		size =0;
	}
	public void Add (int data) {
		if (root == null) {           // if the tree is empty
			root = new Node (data);
			size ++  ;
		}else {
			Node p =root ;      // whit this node we are running on tree
			while (true) {
				if(p.data >= data ) {        // we go left 
					if(p.left==null) {             // if the first left is null
						p.left = new Node (data) ;
						size ++ ;
						break;
					}else {              // if the one is not null
						p = p.left;
					}
				}else {                       // if p.data <= data go right
					if(p.right==null) {           // if the one root right is null 
						p.right = new Node (data) ;
						size ++ ;
						break;
					}else {
						p = p.right;
					}
				}			}
		}
	}
	public void in_Order () {
		in_Order(root);
	}
	private void in_Order(Node curr) {
		if (curr != null) {
			in_Order (curr.left) ;
			System.out.println(curr + " ");
			in_Order(curr.right);
		}

	}
	public void pre_Order () {
		pre_Order(root);
	}
	private void pre_Order(Node curr) {
		if (curr != null) {
			System.out.println(curr + " ");
			pre_Order (curr.left) ;
			pre_Order(curr.right);
		}
	}
	public Node Search(int data) {            // search method - to search a node in the tree
		Node p = root ;
		while (p != null && p.data!=data) {
			if (p.data <data ) {
				p=p.right;
			}else {
				p=p.left;
			}
		}
		return p;
	}
	public Node get_father(Node n) {            // the method return the father of the node
		Node p = root ;
		while (p != null && p.data!=n.data) {
			if (p.data < n.data ) {
				if(p.right.data == n.data)
					return p;
				p=p.right;
			}else {
				if(p.left.data == n.data) 
					return p ;
				p=p.left;
			}
		}
		return p;
	}
	public Node getMin (Node curr) {                // to know the min mode in the tree (the lowest)
		Node p = curr;
		while (p.left != null) 
			p=p.left;
		return p;

	}
	public boolean Remove (int data) {
		Node v = Search (data) ;
		Node father = get_father (v);     // father of data
		if (v==null) return false;     // that for the case that we dont fauond the node
        if(v.left != null && v.right == null) {            // for the case that we have one san in left
        	if(father.right == v) {
        		father.right = v.left;
        		size -- ;
        		   return true;
        	}else {
        		father.left = v.left;
        		size--;
        		   return true;
        	}
        }else if (v.left == null && v.right != null) {        // for the case that we have one san in right
        	if(father.right == v) {
        		father.right = v.right;
        		size--;
        		   return true;
        	}else {
        		father.left = v.right;
        		size --;
        		   return true;
        	}
        }
		Node Min = getMin (v.right) ;                  // for the case that we have to sans .
		v.data = Min.data;
		Node t= get_father (Min);
		t.left=null;
        return true;
	}
}
