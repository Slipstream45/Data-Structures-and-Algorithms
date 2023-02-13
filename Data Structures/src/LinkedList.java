
public class LinkedList {
	class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	class SinglyLL {
		Node head;
		
		public void insertAtBeginning(int data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		public void insertAtEnd(int data) {
			Node newNode = new Node(data);
			if(head==null) {
				head = newNode;
				return;
			}
			Node last=head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = newNode;
			newNode.next = null;
		}
		public void insertAtAnyPoint(int data, int position) {
			Node newNode = new Node(data);
			if(head==null) {
				head = newNode;
				return;
			}
			Node prev = head;
			for(int i=1;prev!=null && i<position-1;i++) {
				prev = prev.next;
			}
			if(prev==null) {
				System.out.println("Error: Position not found");
				return;
			}
			newNode.next = prev.next;
			prev.next = newNode;
		}
		public void deleteAtBeginning() {
			if(head==null) {
				System.out.println("Linked List be empty!");
				return;
			}
			head = head.next;
			
		}
		public void deleteAtEnd() {
			if(head==null) {
				System.out.println("Linked List be empty!");
				return;
			}
			if(head.next==null) {
				head=null;
				return;
			}
			Node prev = head;
			Node curr = head.next;
			while(curr.next!=null) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = null;
		}
		public void deleteAtAnyPosition(int position) {
			if(head==null) {
				System.out.println("Linked List be empty!");
			}
			if(position==1) {
				head = head.next;
				return;
			}
			Node prev=head;
			for(int i=1;prev!=null && i<position-1;i++) {
				prev = prev.next;
			}
			if(prev==null||prev.next==null) {
				System.out.println("Position not found.");
			}
			prev.next = prev.next.next;
		}
		public void display() {
			if(head==null) {
				System.out.println("Linked List is empty!");
				return;
			}
			Node temp= head;
			while(temp!=null) {
				System.out.print(temp.data + ", ");
				temp = temp.next;
			}
			System.out.println();
		}
		public void search(int data) {
			int i=0;
			if(head==null) {
				System.out.println("Linked List be emmpty!");
				return;
			}
			Node temp = head;
			while(temp!=null) {
				if(temp.data==data ) {
					System.out.println("Element found at: "+i + " position");
				}
				temp=temp.next;
				i++;
			}
			System.out.println("Element not found in the list!");
		}
	}
		
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList.SinglyLL sll = ll.new SinglyLL();
		sll.insertAtBeginning(1);
		sll.insertAtAnyPoint(2, 2);
		sll.insertAtAnyPoint(3, 3);
		sll.insertAtEnd(10);
		sll.insertAtAnyPoint(7, 3);
		
		sll.deleteAtBeginning();
		sll.deleteAtEnd();
		sll.deleteAtAnyPosition(2);
		
		sll.search(4);
		
		
		sll.display();
	}
}

