package com.bridgelabz.programs;

public class LinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
		}
	}
	
	/*--------------------Appending a new Node----------------------*/
	public LinkedList appendNode(LinkedList list, int d) {
		Node newNode = new Node(d);
		newNode.next = null;
		if(list.head == null) {
			list.head = newNode;
		}
		else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}
	
	/*---------------------Adding a new Node------------------------*/
	public LinkedList addNode(LinkedList list, int d) {
		Node newNode = new Node(d);
		if(list.head == null) {
			list.head = newNode;
			newNode.next = null;
		}
		else {
			newNode.next = list.head;
			list.head = newNode;
		}
		return list;
	}
	
	/*--------------------Inserting a new node at given position-----------------*/
	public LinkedList insertNode(LinkedList list, int pos, int d) {
		Node newNode = new Node(d);
		int count = 0;
		if(pos == 0) {
			newNode.next = list.head;
			list.head = newNode;
		}
		else {
			Node current = list.head;
			Node after = current.next;
			while(count < pos - 1) {
				current = current.next;
				after = after.next;
				count++;
			}
			current.next = newNode;
			newNode.next = after;
			current = after;
			while(current.next != null) {
				current = current.next;
			}
		}
		return list;
	}
	
	/*--------------------------Deleting the first element------------------------*/
	public LinkedList pop(LinkedList list) {
		list.head = list.head.next;
		return list;
	}
	
	/*--------------------------Deleting last element----------------------------*/
	public LinkedList popLast(LinkedList list) {
		Node current = list.head;
		Node after = current.next;
		while(after.next != null) {
			current = current.next;
			after = after.next;
		}
		current.next = null;
		return list;
	}
	
	/*------------------------Searching for a particular element---------------------*/
	public String searchElement(LinkedList list, int d) {
		Node current = list.head;
		while(current.next != null) {
			if(current.data == d) {
				return "Element exists";
			}
			current = current.next;
		}
		if(current.data == d) {
			return "Element exists";
		}
		return "Element does not exist";
	}
	
	/*---------------------Inserting element after a given element------------------*/
	public LinkedList insertAfterElement(LinkedList list, int element, int d) {
		Node newNode = new Node(d);
		Node current = list.head;
		Node after = current.next;
		while(after.next != null) {
			if(current.data == element) {
				current.next = newNode;
				newNode.next = after;
			}
			current = current.next;
			after = after.next;
		}
		if(current.data == element) {
			current.next = newNode;
			newNode.next = after;
		}
		if(after.data == element) {
			after.next = newNode;
			newNode.next = null;
		}
		return list;
	}
	
	/*---------delete a particular element and return the length of the list---------*/
	public int deleteElementAndReturnLength(LinkedList list, int d) {
		Node current = list.head;
		Node after = current.next;
		while(after.next != null) {
			if(after.data == d) {
				after = after.next;
				current.next = after;
			}
			else{
				after = after.next;
				current = current.next;
			}
		}
		if(after.data == d) {
			current.next = null;
		}
		int count = printListAndReturnLength(list);
		return count;
	}
	
	public int printListAndReturnLength(LinkedList list) {
		int count = 0;
		Node currentNode = list.head;
		while(currentNode.next != null) {
			System.out.print(currentNode.data +"->");
			currentNode = currentNode.next;
			count++;
		}
		System.out.println(currentNode.data);
		count++;
		return count;
	}
	
	public void printList(LinkedList list) {
		Node currentNode = list.head;
		while(currentNode.next != null) {
			System.out.print(currentNode.data +"->");
			currentNode = currentNode.next;
		}
		System.out.println(currentNode.data);
	}
}
