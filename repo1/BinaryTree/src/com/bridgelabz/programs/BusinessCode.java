package com.bridgelabz.programs;

public class BusinessCode {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(56);
		binaryTree.insert(30);
		binaryTree.insert(75);
		//binaryTree.insert(25);
		//binaryTree.insert(69);
		//binaryTree.insert(55);
		binaryTree.display();
				
		System.out.println();
		if(binaryTree.search(55) != null) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
		binaryTree.levelOrder();
	}
}