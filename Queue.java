package com.bridgelabz.stackQueue;

import com.bridgelabz.datastructure.*;

/**
 * @author tushar.kasturi_ymedi
 *
 * @param <K> This is generic parameter
 */
public class Queue<K> {

	private final LinkedList<K> LinkedListObject;

	public Queue() {
		LinkedListObject = new LinkedList<>();
	}
	
	//This method prints the stack
	public void print() {
		LinkedListObject.show();
	}
	
	/**
	 * This method implements enqueu by indirectly calling insert method of linkedlist
	 * 
	 * @param data This parameter takes in generic type data
	 */
	public void enqueu(K data) {
		LinkedListObject.insert(data);
	}
}
