package com.abhi.linklist;

public class SingleLinkList {
	private Node head;
	private Node tail;

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public SingleLinkList() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insertFirst(int item) {
		Node n = new Node();
		n.item = item;
		n.next = head;
		head = n;
	}

	public void insertLast(int item) {
		Node n = new Node();
		n.item = item;
		Node node = head;
		if (node == null) {
			head = n;
		} else {
			while (node.next != null) {
				node = node.next;
			}
			node.next = n;
		}
	}

	public void insert(int item) {
		Node n = new Node();
		n.item = item;
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
	}

	public void delete(int item) {
		if (!isEmpty()) {
			Node n = head;
			Node p = n;

			if (head.item == item) {
				head = head.next;
			} else {
				while (n != null) {
					if (n.item == item) {
						p.next = n.next;
						break;
					}
					p = n;
					n = n.next;
				}
			}
		}
	}

	public void print() {
		Node n = head;
		while (n != null) {
			System.out.println(n.item);
			n = n.next;
		}
	}

	public void printUsingRecursion(Node n) {
		if (n == null) {
			return;
		}
		System.out.println(n.item);
		printUsingRecursion(n.next);
	}

	public void printReverseUsingRecursion(Node n) {
		if (n == null) {
			return;
		}
		printUsingRecursion(n.next);
		System.out.println(n.item);
	}

	public void reverse() {
		if (!isEmpty()) {
			Node previous = null;
			Node current = head;
			while (current != null) {
				Node next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
			head = previous;
		}
	}

	public void reverseUsingRecursion(Node n) {
		if (n.next == null) {
			head = n;
			return;
		}
		reverseUsingRecursion(n.next);
		Node next = n.next;
		next.next = n;
		n.next = null;
	}

	class Node {
		private int item;
		private Node next;

		@Override
		public String toString() {
			return "[item=" + item + "]";
		}
	}
}
