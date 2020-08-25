package com.abhi.tree;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public Node getRoot() {
		return this.root;
	}

	public void insert(int data) {
		try {
			root = insertRec(root, data);
		} catch (Exception e) {
			System.out.println("Exception occured in insert " + e.getMessage());
		}
	}

	public void find(int data) {
		try {
			if (root == null) {
				System.out.println("Tree is empty");
			} else {
				root = findRec(root, data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int findMin(Node root) {

		if (root == null) {
			return -1;
		} else if (root.left == null) {
			return root.item;
		}

		return findMin(root.left);

	}

	public int findMax(Node root) {

		if (root == null) {
			return -1;
		} else if (root.right == null) {
			return root.item;
		}

		return findMin(root.right);

	}

	private Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		} else if (data <= root.item) {
			root.left = insertRec(root.left, data);
		} else {
			root.right = insertRec(root.right, data);
		}
		return root;
	}

	private Node findRec(Node root, int data) {
		if (root == null) {
			System.out.println("Item is not found in tree");
		} else if (data == root.item) {
			System.out.println("Item is found in tree");
		} else if (data <= root.item) {
			root.left = findRec(root.left, data);
		} else {
			root.right = findRec(root.right, data);
		}
		return root;
	}

	public boolean isSubTreeLesser(Node root, int data) {
		if (root == null) {
			return true;
		}

		if (root.item <= data && isSubTreeLesser(root.left, data) && isSubTreeLesser(root.right, data)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isSubTreeGreater(Node root, int data) {
		if (root == null) {
			return true;
		}

		if (root.item > data && isSubTreeGreater(root.left, data) && isSubTreeGreater(root.right, data)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isBinarySearchTree1(Node root) {

		if (root == null) {
			return true;
		}

		if (isSubTreeLesser(root.left, root.item) && isSubTreeGreater(root.right, root.item)
				&& isBinarySearchTree1(root.left) && isBinarySearchTree1(root.right)) {
			return true;
		}

		return false;
	}

	public boolean isBstUtil(Node root, int minValue, int maxValue) {
		if (root == null) {
			return true;
		}

		if (root.item > minValue && root.item < maxValue && isBstUtil(root.left, minValue, root.item)
				&& isBstUtil(root.right, root.item, maxValue)) {
			return true;
		}

		return false;
	}

	public boolean isBinarySearchTree2(Node root) {

		return isBstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	class Node {
		private int item;
		private Node left;
		private Node right;

		public Node(int item) {
			this.item = item;
			left = right = null;
		}

		public int getItem() {
			return item;
		}

		public Node getLeft() {
			return left;
		}

		public Node getRight() {
			return right;
		}

		@Override
		public String toString() {
			return "Node [item=" + item + "]";
		}
	}
}