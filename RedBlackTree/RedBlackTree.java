//package RedBlackTree;
//
//public class RedBlackTree {
//	Node root;
//	int size;
//	public RedBlackTree () {
//		root = null;
//		size=0;
//	}
//	public void Add (int data) {
//		Node n =new Node (data);
//		if (root == null) {          // if its tree empty
//			root = n;
//			root.isBlack = true;
//			size ++ ;
//		}
//		Add (n,root) ;        // if its not a tree ampty
//	}
//	private void Add(Node node, Node parent) {
//		if(node.data > parent.data) {  // we go right
//			if(parent.right == null) {   // if when we go right thats empty
//				parent.right = node;
//				node.parent=parent;
//				node.isBlack = false;
//				size ++ ;
//				return;
//			}
//			Add (node,parent.right) ; // if its not empty we going right in recursia until thats will be null.
//
//		}else {    // if we don't entering to the right side
//			if(parent.left == null) {   // if when we go left thats empty
//				parent.left = node;
//				node.parent=parent;
//				node.isBlack = false;
//				node.isLeftChild=true;
//				size ++ ;
//				return;
//			}
//			Add (node,parent.left) ; 
//		}
//		checkColor (node);
//	}
//	private void checkColor(Node node) {   
//		if (node.parent == null) {
//			return;
//		}
//		if (! (node.isBlack)&& !(node.parent.isBlack)) {     // if we have son and father red.
//			CorrectTree (node);
//		}
//		checkColor(node.parent);
//	}
//	private void CorrectTree(Node node) {
//		if(node.parent.isLeftChild) {     
//			Node Aunt =node.parent.parent.right;    // if its black aunt we make rotaion
//			if(Aunt == null || Aunt.isBlack) {
//				rotate(node) ;
//			}else {            // if its red aunt we fix the colors
//				Aunt.isBlack =true;
//				node.parent.parent.isBlack = false;
//				node.parent.isBlack = true;
//				return;
//			}
//		}else {               // if the aunt is left child
//			Node Aunt = node.parent.parent.left;
//			if(Aunt == null || Aunt.isBlack) {
//				rotate(node) ;
//			}else {            // if its red aunt we fix the colors
//				Aunt.isBlack =true;
//				node.parent.parent.isBlack = false;
//				node.parent.isBlack = true;
//				return;
//			}
//		}
//	}
//	private void rotate(Node node) {
//		if (node.isLeftChild) {
//			if(node.parent.isLeftChild) {     // left left problem
//			//	rightRotate(node.parent.parent);
//				node.isBlack = false;
//				node.parent.isBlack=true;
//				if (node.parent.right !=null) {
//					node.parent.right.isBlack =false;
//				}
//				return;
//			}
//	//		RightLeftRotation(node.parent.parent);    // right left problem
//			node.isBlack =true;
//			node.left.isBlack=false;
//			node.right.isBlack=false;
//			return;
//		}else {
//			if (!(node.parent.isLeftChild)) {              // right right problem
//				leftRotate(node.parent.parent);
//				node.isBlack = false;
//				node.parent.isBlack =true;
//		//		if(node.parent.right != null) {
//					node.parent.right.isBlack = false;
//				}
//				return;
//			}
//	//		leftRightRotation(node.parent.parent);
//			node.isBlack = true;
//			node.left.isBlack = false;
//			node.right.isBlack =false;
//			return;
//		}
//}
//	public void leftRotate (Node node) {
//		Node tmp = node.right;
//		node.right = tmp.left;
//		if(node.right != null) {
//			node.right.parent = node;
//			node.right.isBlack =false;
//		}
//		if (node.parent == null) {
//			root = node;
//			return;
//		}else {
//			tmp.parent = node.parent;
//			if(node.isLeftChild) {
//				tmp.isLeftChild = true;
//				tmp.parent.left = tmp;
//			}else {
//				tmp.isLeftChild=false;
//				tmp.parent.right=tmp;
//			}
//		}
//		tmp.left=node;
//		node.isLeftChild=true;
//		tmp.left.parent=tmp;
//	}
//}
