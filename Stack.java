package dsa_Lab;

import java.util.LinkedList;

public class Stack {
    
	LinkedList<Integer> stack;

    public Stack() {
        
    	stack = new LinkedList<Integer>();
    }

    public void push(int data) {
        
    	stack.addFirst(data);
    }

    public boolean isEmpty() {
        
    	return stack.isEmpty();
    }

    public int pop() {
        
    	if (stack.isEmpty()) 
    	{
            System.out.println("Empty Stack");
            return -1;
        } 
    	else 
    	{
            return stack.removeFirst();
        }
    }

    public int peek() {
        
    	if (stack.isEmpty()) 
    	{
            System.out.println("Empty Stack");
            return -1;
        } 
    	else 
    	{           
        	return stack.getFirst();
        }
    }

    public void display() {
        
    	if (stack.isEmpty()) {
			
    		System.out.println("Empty Stack");
		}
    	
    	System.out.println(stack);   
    }  
}



