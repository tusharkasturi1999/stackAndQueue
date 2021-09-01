package com.bridgelabz.stackQueue;

import com.bridgelabz.datastructure.*;

/**
 * @author tushar.kasturi_ymedi
 *
 * @param <T> This is generic parameter
 */
public class Stack<K> {

	private final LinkedList<K> LinkedListObject;

	public Stack() {
		LinkedListObject = new LinkedList<>();
	}

	/**
	 * This method implements push by indirectly calling insert method of linkedlist
	 * 
	 * @param data This parameter takes in generic type data
	 */
	public void push(K data) {
		LinkedListObject.insertAtStart(data);
	}
	
	//This method prints the stack
	public void print() {
		LinkedListObject.show();
	}
	
	//This method returns the topmost element
	public K peek() {
		System.out.println("Topmost element is: " +LinkedListObject.head.data);
		return LinkedListObject.head.data;
	}
	
	public void pop() {
		LinkedListObject.pop();
	}

}
