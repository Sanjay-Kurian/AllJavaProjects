package com.bridgelabz.programs;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	TreeNode root;
	
	class TreeNode{
		TreeNode left;
		TreeNode right;
		int data;
		
		TreeNode(int d){
			this.data = d;
		}
	}
	
	public void insert(int d) {
		root = insertNode(root,d);
	}
	
	public TreeNode insertNode(TreeNode root, int d) {
		if(root == null) {
			root = new TreeNode(d);
			return root;
		}
		if(root.data > d) {
			root.left = insertNode(root.left,d);
		}
		else if(root.data < d) {
			root.right = insertNode(root.right,d);
		}
		return root;
	}
	
	public void display() {
		displayTree(root);
	}
	
	public void displayTree(TreeNode root) {
		if(root == null) {
			return;
		}
		displayTree(root.left);
		System.out.print(root.data +" ");
		displayTree(root.right);
	}
	
	public TreeNode search(int d) {
		TreeNode element = searchElement(root, d);
		return element;
	}
	
	public TreeNode searchElement(TreeNode root, int d) {
		if(root == null || root.data == d) {
			return root;
		}
		if(root.data > d) {
			return searchElement(root.left, d);
		}
		else {
			return searchElement(root.right, d);
		}
	}
	
	public void levelOrder() {
		if(root == null) {
			return;
		}
		Queue <TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data +" ");
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
		}
	}
}
