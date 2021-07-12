package com.bridgelabz.programs;

public class OrderedLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
		}
	}
	
	public OrderedLinkedList sortAndAdd(OrderedLinkedList list, int d) {
		Node newNode = new Node(d);
		newNode.next = null;
		if(list.head == null) {
			list.head = newNode;
		}
		else if(list.head.next == null) {
			if(list.head.data < d) {
				list.head.next = newNode;
			}
			else {
				newNode.next = list.head;
				list.head = newNode;
			}
		}
		else {
			Node current = list.head;
			Node after = current.next;
			while(after != null) {
				if(current.data > d) {
					newNode.next = list.head;
					list.head = newNode;
				}
				else if(current.data < d && after.data > d) {
					current.next = newNode;
					newNode.next = after;
				}
				current = current.next;
				after = after.next;
			}
			if(current.data < d) {
				current.next = newNode;
				newNode.next = null;
			}
		}
		return list;
	}
	
	public void printList(OrderedLinkedList list) {
		Node currentNode = list.head;
		while(currentNode.next != null) {
			System.out.print(currentNode.data +"->");
			currentNode = currentNode.next;
		}
		System.out.println(currentNode.data);
	}
}
