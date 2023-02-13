
public class TreeTraversals {
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
	TreeTraversals(){
		this.root = null;
	}
	
	public void insert(int data) {
		root = insertRec(root, data);
	}
	public Node insertRec(Node root, int data) {
		if(root==null) {
			return new Node(data);
		}
		if(data<root.data) {
			root.left = insertRec(root.left, data);
		} if(data>root.data) {
			root.right = insertRec(root.right, data);
		} else {
			return root;
		}
		return root;
	}
	public void printPre() {
		System.out.println("Pre Order");
		preOrder(root);
		
	}
	public void printIn() {
		System.out.println("\nIn Order");
		inOrder(root);
		
	}
	public void printPost() {
		System.out.println("\nPost Order");
		postOrder(root);
		
	}
	public void display() {
		preOrder(root);
		inOrder(root);
		postOrder(root);
	}
	public void preOrder(Node root) {
		if(root!=null) {
		System.out.print(root.data + ", ");
		preOrder(root.left);
		preOrder(root.right);
		}
	}
	public void inOrder(Node root) {
		if(root!=null) {
		inOrder(root.left);
		System.out.print(root.data + ", ");
		inOrder(root.right);
		}
	}
	public void postOrder(Node root) {
		if(root!=null) {
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + ", ");
		}
	}
	public static void main(String[] args) {
		TreeTraversals travel = new TreeTraversals();
		travel.insert(8);
        travel.insert(3);
        travel.insert(10);
        travel.insert(1);
        travel.insert(6);
        travel.insert(14);
        travel.insert(4);
        travel.insert(7);
        travel.insert(13);
        
        travel.printPre();
        travel.printIn();
        travel.printPost();
	}
}
