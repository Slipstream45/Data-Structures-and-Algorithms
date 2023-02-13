import java.util.*;

public class Stack {
	static final int size = 1000;
	int[] stack = new int[size];
	int top;
	
	Stack(){
		top = -1;
	}
	
	boolean push(int x) {
		if(top>=size) {
			System.out.println("Stack Overflow!");
			return false;
		} else {
			stack[++top] = x;
			System.out.println(x + " was pushed into the stack.");
			return true;
		}
	}
	void pop() {
		if(top<=-1) {
			System.out.println("Stack Underflow!");
		} else {
			int x = stack[--top];
			System.out.println(x + " was popped from the stack.");
		}
	}
	void display() {
		System.out.println("Stack contents are: \n");
		for(int i=0;i<top;i++) {
			System.out.print(stack[i] + ", ");
		}
	}
	void isFull() {
		if(top >= size-1) {
			System.out.println("Stack is full");
		}
	}
	void isEmpty() {
		if(top<=0) {
			System.out.println("Stack is empty");
		}
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. isFull");
            System.out.println("5. isEmpty");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to push");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    s.isFull();
                    break;
                case 5:
                    s.isEmpty();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            sc.close();
		}
	}
}
