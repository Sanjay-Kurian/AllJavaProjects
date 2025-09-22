package com.bridgelabz.programs;

public class BusinessCode {
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.addNode(70);
		stack.addNode(30);
		stack.addNode(56);
		stack.printList();
		stack.popNode();
		stack.printList();
		System.out.println(stack.peakNode());
		
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.appendNode(56);
		queue.appendNode(30);
		queue.appendNode(70);
		queue.printList();
		queue.dequeueNode();
		queue.printList();
	}
}
