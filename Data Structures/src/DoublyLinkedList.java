
public class DoublyLinkedList {

static class Node{
		int data;
		Node prev;
		Node next;
		
	Node(int data){
		this.data = data;
		this.prev = null;
		this.prev = null;
	}
}
	Node head;
	
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.prev = head;
		head.prev = newNode;
		head = newNode;
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}
	
	public void insertAtPosition(int data, int position) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
			return;
		}
		if(position ==1) {
			insertAtBeginning(data);
			return;
		}
		
		Node temp = head;
		int current =1;
		while(temp!=null && current < position-1) {
			temp = temp.next;
			current++;
		}
		
		if(temp==null || temp.next == null) {
			insertAtEnd(data);
			return;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		newNode.prev = temp;
		
		if(newNode.next!=null) {
			newNode.next.prev = newNode;
		}
	}
	public void deleteAtBeginning() {
		if(head==null) {
			System.out.println("The list is empty!");
		}
		head = head.next;
		head.prev = null;
	}
	public void deleteAtTheEnd() {
		if(head==null) {
			System.out.println("The list is empty!");
		}
		Node curr = head.next;
		Node prev = head;
		while(curr.next!=null) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = null;
		curr.prev = null;
		
	}
	public void deleteAtAnyPositon(int position) {
		if(head==null) {
			System.out.println("The list is empty");
		}
		Node temp = head;
		int count =0;
		while(temp!=null && count<position-1) {
			temp = temp.next;
			count++;
		}
		if(temp==null || temp.next == null) {
			System.out.println("Out of bounds error");
			return;
		}
		Node nextNode = temp.next.next;
		temp.next = nextNode;
		nextNode.prev = temp;
	}
	public void display() {
		if(head==null) {
			System.out.println("Its empty!");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
	}
	public void search(int data) {
		if(head==null) {
			System.out.println("Its empty");
		}
		int count =1;
		Node temp = head;
		while(temp!=null) {
			if(temp.data==data) {
				System.out.println("Element found at : " + count);
			}
			temp=temp.next;
			count++;
		}
		System.out.println("Element not found in list");
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtBeginning(1);
		dll.insertAtPosition(2, 2);
		dll.insertAtPosition(10,3);
		dll.insertAtPosition(8, 4);
		dll.insertAtPosition(24, 3);
		dll.insertAtEnd(100);
		
		dll.deleteAtBeginning();
		dll.deleteAtTheEnd();
		dll.deleteAtAnyPositon(2);
		
		dll.search(7);
		dll.display();
	}
	
}