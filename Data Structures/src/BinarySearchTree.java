
public class BinarySearchTree {
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
	BinarySearchTree(){
		root = null;
	}
	public void insert(int data) {
		root = insertRecursive(root, data);
	}
	public Node insertRecursive(Node root, int data) {
		if(root==null) {
			return new Node(data);
		}
		if(data < root.data) {
			root.left = insertRecursive(root.left, data);
		}
		if(data > root.data) {
			root.right = insertRecursive(root.right, data);
		}
		else {
			return root;
		}
		return root;
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(20);
		bst.insert(30);
	}
	
}
