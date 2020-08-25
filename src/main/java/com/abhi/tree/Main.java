package com.abhi.tree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(5);
		bst.insert(7);
		
		bst.find(3);
		
		System.out.println("Root of element of tree is: " + bst.getRoot());
		System.out.println("Min element in tree is: " + bst.findMin(bst.getRoot()));
		System.out.println("Max element in tree is: " + bst.findMax(bst.getRoot()));
		System.out.println("Check binary search tree method1: " + bst.isBinarySearchTree1(bst.getRoot()));
		System.out.println("Check binary search tree method2: " + bst.isBinarySearchTree2(bst.getRoot()));
	}

}
