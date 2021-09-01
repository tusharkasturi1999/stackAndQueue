package com.bridgelabz.stackQueue;

/**
 * @author tushar.kasturi_ymedi
 *
 */
public class StackQueueDriver {
	
	//This is the main method
	public static void main(String[] args) {
		Stack<Integer> object = new Stack<>();
		object.push(70);
		object.push(30);
		object.push(56);
		object.print();
		object.peek();
		object.pop();
		object.print();
		object.peek();
		object.pop();
		object.print();		
	}

}
