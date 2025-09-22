package com.bridgelabz.programs;

public class QueueUsingLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
		}
	}
	
	public void appendNode(int d) {
		Node newNode = new Node(d);
		newNode.next = null;
		if(head == null) {
			head = newNode;
		}
		else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}
	
	public void dequeueNode() {
		if(head == null) {
			System.out.println("No more elements to dequeue");
		}
		else {
			head = head.next;
		}
	}
	
	public void printList() {
		Node currentNode = head;
		while(currentNode.next != null) {
			System.out.print(currentNode.data +"->");
			currentNode = currentNode.next;
		}
		System.out.println(currentNode.data);
	}

}
