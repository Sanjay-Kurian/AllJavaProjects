package com.bridgelabz.programs;

public class HashTable {
	int size;
	int bucketSize;
	HashNode[] buckets;
	
	public HashTable() {
		bucketSize = 10;
		size = 0;
		this.buckets = new HashNode[bucketSize];
	}
	
	class HashNode {
		String key;
		int value;
		HashNode next;
		
		HashNode(String key){
			this.key = key;
			this.value = 1;
			this.next = null;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int getIndex(String str) {
		int hashCode = Math.abs(str.hashCode());
		return hashCode % bucketSize;
	}
	
	public void add(String key) {
		int bucketIndex = getIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = head.value + 1;
				return;
			}
			head = head.next;
		}
		size ++;
		head = buckets[bucketIndex];
		HashNode newNode = new HashNode(key);
		newNode.next = head;
		buckets[bucketIndex] = newNode;
	}
	
	public int getValue(String key) {
		int bucketIndex = getIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return 0;
	}
	
	public void printl() {
		for(HashNode element: buckets) {
			System.out.println(element.key +":" +element.value);
		}
	}
	
	public void print() {
		for(int i = 0;i < bucketSize; i++) {
			HashNode head = buckets[i];
			while(head != null) {
				System.out.println(head.key +":" +head.value);
				head = head.next;
			}
		}
	}
}
