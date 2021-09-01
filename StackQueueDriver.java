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
		stackObject.peek();
		stackObject.pop();
		stackObject.print();
		System.out.println();
		
		Queue<Integer> queueObject = new Queue<>();
		System.out.println("Queue Operations");
		queueObject.enqueue(56);
		queueObject.enqueue(30);
		queueObject.enqueue(70);
		queueObject.print();
		queueObject.dequeue();
		queueObject.print();
		queueObject.dequeue();
		queueObject.print();
		queueObject.dequeue();
		queueObject.print();
	}

}
