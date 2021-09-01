package com.bridgelabz.stackQueue;

/**
 * @author tushar.kasturi_ymedi
 *
 */
public class StackQueueDriver {
	
	//This is the main method
	public static void main(String[] args) {
		Stack<Integer> stackObject = new Stack<>();
		System.out.println("Stack Operations");
		stackObject.push(70);
		stackObject.push(30);
		stackObject.push(56);
		stackObject.print();
		stackObject.peek();
		stackObject.pop();
		stackObject.print();
		stackObject.peek();
		stackObject.pop();
		stackObject.print();		
		System.out.println();
		
		Queue<Integer> queueObject = new Queue<>();
		System.out.println("Queue Operations");
		queueObject.enqueu(56);
		queueObject.enqueu(30);
		queueObject.enqueu(70);
		queueObject.print();
	}

}
