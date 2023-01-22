package dsa_Lab;

public class StackMain {

	public static void main(String[] args) {
        
		Stack stack = new Stack();
		
		stack.push(100);
        stack.push(300);
        stack.push(500);
              
        stack.display();
        
        System.out.println("Top element of stack: " + stack.peek());
        
        System.out.println("Popped element from the stack: " + stack.pop());
    }
}
