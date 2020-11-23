package Test2019;

public class MultiyMap {
	Node  root;
	int size;

	public MultiyMap () {
		root = null;
		size =0;
	}
	public void add (Integer key , Object value) {
		Node p = new Node (key , value);
		if (root == null) {
			root =p;
			size ++;
		}else {
			boolean flag = true;
			while (flag) {
				if (root.key<p.key) {
					if (root.left==null) {
						p = root.left;
						size ++;
						flag =false;
					}else {
						p=p.left;
					}
				}else {
					if (root.right == null) {
						p= root.right;
						size ++ ;
						flag =false;
					}else {
						p=p.right;
					}
				}if (root.key==p.key) {
					
				}
				
			}
		}
     
           }

	}



