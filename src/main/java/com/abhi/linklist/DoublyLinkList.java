package com.abhi.linklist;

public class DoublyLinkList {
	
	private Node head;
	private Node tail;
	
	public DoublyLinkList() {
		head = null;
		tail = null;
	}
	
	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public void insert(int item) {
		Node n = new Node();
		n.item = item;
		
		if (head == null) {
			head = n;
			tail = n;
		} else {
			n.previous = tail;
			tail.next = n;
			tail = n;
		}
		
	}
	
	public void print() {
		Node n = head;
		while (n != null) {
			System.out.println(n.item);
			n = n.next;
		}
	}
	
	
	class Node {
		private int item;
		private Node previous;
		private Node next;
		
		public int getItem() {
			return item;
		}

		public Node getPrevious() {
			return previous;
		}
		
		public Node getNext() {
			return next;
		}



		@Override
		public String toString() {
			return "[item=" + item + "]";
		}
	}

}
