import java.util.Queue;
import java.util.LinkedList;
public class LevelOrderTraversal {
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
	
	//get each element into a queue and print them out (add root -> start loops -> print -> check left -> check right
	void levelOrderTraversal() {
		Queue<Node> queue = new LinkedList<Node>();
		
		//add root first
		queue.add(root);
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.print(current.data + ", ");
			if(current.left!=null) {
				queue.add(current.left);
			}
			if(current.right!=null) {
				queue.add(current.right);
			}
			
		}
		return;
	}
	public static void main(String[] args) {
		LevelOrderTraversal travel = new LevelOrderTraversal();
		travel.insert(8);
        travel.insert(3);
        travel.insert(10);
        travel.insert(1);
        travel.insert(6);
        travel.insert(14);
        travel.insert(4);
        travel.insert(7);
        travel.insert(13);
        
        travel.levelOrderTraversal();
	}
}
