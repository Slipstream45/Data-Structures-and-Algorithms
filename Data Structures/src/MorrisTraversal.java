
public class MorrisTraversal {
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
	Node root;
	public void insert(int data) {
		root = insertRecursive(root, data);
	}
	public Node insertRecursive(Node root, int data) {
		if(root==null) {
			return new Node(data);
		}
		if(data<root.data) {
			root.left = insertRecursive(root.left, data);
		}
		if(data>root.data) {
			root.right = insertRecursive(root.right, data);
		}
		return root;
	}
	
	
	public void morrisTraversal() {
		Node current = root;
		while(current!=null) {
			if(current.left==null) {
				System.out.print(current.data + ", ");
				current = current.right;
			} else {
				Node prev = current.left;
				while(prev.right!=null && prev.right!=current) {
					prev = prev.right;
				}
				if(prev.right == null) {
					prev.right = current;
					current = current.left;
				}else {
					prev.right =null;
					System.out.print(current.data + ", ");
					current = current.right;
				}
			}
		}
	}
	public static void main(String[] args) {
		MorrisTraversal travel = new MorrisTraversal();
		travel.insert(8);
        travel.insert(3);
        travel.insert(10);
        travel.insert(1);
        travel.insert(6);
        travel.insert(14);
        travel.insert(4);
        travel.insert(7);
        travel.insert(13);
        
        travel.morrisTraversal();
	}
}
