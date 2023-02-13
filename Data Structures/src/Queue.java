public class Queue {
	class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public void delete() {
		if(head==null) {
			System.out.println("Queue is empty.");
			return;
		}
		Node curr = head;
		Node prev = head.next;
		while(curr.next!=null) {
			prev = curr;
			curr = curr.next;
		}
		System.out.println("\n" + curr.data + " deleted");
		prev.next = null;
	}
	public void display() {
		if(head==null) {
			System.out.println("Queue is empty");
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + ", ");
		    temp = temp.next;
		}
		return;
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.insert(2);
		q.insert(4);
		q.insert(6);
		q.insert(8);
		q.insert(10);
		
		q.display();
		
		q.delete();
		
		q.display();
	}
}
