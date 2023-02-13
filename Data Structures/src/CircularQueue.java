//This code has infinite loop since I couldn't handle the display stuff properly
public class CircularQueue {
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data= data;
			this.next = null;
		}
	}
	static Node front = null;
	static Node rear = null;
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(front==null && rear==null) {
			front =rear =newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
			rear.next = front;
		}
	}
	public void dequeue() {
		if(front==null && rear==null) {
			System.out.println("Queue is empty.");
			return;
		}else if(front==rear) {
			int data = front.data;
			front = rear = null;
			System.out.println("\n" + data + " deleted");
			return;
		} else {
			int data = front.data;
			front = front.next;
			rear.next = front;
			System.out.println("\n" + data + " deleted");
			return;
		}
		
	}
	public void display() {
		Node temp = front;
		while(temp.next!=null) {
			System.out.print("\n" + temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		CircularQueue queue=new CircularQueue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		
		queue.dequeue();
	}
}
