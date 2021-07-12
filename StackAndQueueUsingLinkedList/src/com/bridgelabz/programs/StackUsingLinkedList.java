package com.bridgelabz.programs;

public class StackUsingLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
		}
	}
	
	public void addNode(int d) {
		Node newNode = new Node(d);
		if(head == null) {
			head = newNode;
			newNode.next = null;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void popNode() {
		if(head == null) {
			System.out.println("No more elements to pop");
		}
		else {
			head = head.next;
		}
	}
	
	public int peakNode() {
		return head.data;
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
