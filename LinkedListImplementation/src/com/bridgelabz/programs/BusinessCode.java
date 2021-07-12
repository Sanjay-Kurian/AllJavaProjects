package com.bridgelabz.programs;

public class BusinessCode {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList = linkedList.appendNode(linkedList, 56);
		linkedList = linkedList.appendNode(linkedList, 30);
		linkedList = linkedList.appendNode(linkedList, 70);
		linkedList = linkedList.insertNode(linkedList, 1, 25);
		//linkedList.printList(linkedList);
		//linkedList.popLast(linkedList);
		//linkedList.printList(linkedList);
		//System.out.println(linkedList.searchElement(linkedList, 70));
		//System.out.println(linkedList.deleteElementAndReturnLength(linkedList, 70));
		
		LinkedList linkedList1 = new LinkedList();
		linkedList1 = linkedList1.addNode(linkedList1, 70);
		linkedList1 = linkedList1.addNode(linkedList1, 30);
		linkedList1 = linkedList1.addNode(linkedList1, 56);
		//linkedList1.printList(linkedList1);
		linkedList1.pop(linkedList1);
		//linkedList1.printList(linkedList1);
		linkedList1.insertAfterElement(linkedList1, 30, 11);
		//linkedList1.printList(linkedList1);
		
		OrderedLinkedList orderedLinkedList = new OrderedLinkedList();
		orderedLinkedList = orderedLinkedList.sortAndAdd(orderedLinkedList, 56);
		orderedLinkedList = orderedLinkedList.sortAndAdd(orderedLinkedList, 30);
		orderedLinkedList = orderedLinkedList.sortAndAdd(orderedLinkedList, 40);
		orderedLinkedList = orderedLinkedList.sortAndAdd(orderedLinkedList, 70);
		orderedLinkedList.printList(orderedLinkedList);
	}
}
