package com.abhi.linklist;

public class MainClass {
	public static void main(String []args) {
		// SingleLinkList sl = new SingleLinkList();
		DoublyLinkList sl = new DoublyLinkList();
		/*sl.insertFirst(2);
		sl.insertFirst(5);
		sl.insertFirst(6);*/
		
		/*sl.insertLast(2);
		sl.insertLast(5);
		sl.insertLast(6);*/
		
		sl.insert(2);
		sl.insert(5);
		sl.insert(6);
		
		System.out.println("Print before reverse");
		sl.print();
		
		System.out.println("Tail of list is:- " + sl.getTail().getItem());
		
//		System.out.println("Print After reverse");
//		sl.reverseUsingRecursion(sl.getHead());
//		sl.print();
		
//		System.out.println("Print using Iteration");
//		sl.print();
//		System.out.println("Print using recursion");
//		sl.printUsingRecursion(sl.getHead());
//		System.out.println("Print in reverse using recursion");
//		sl.printReverseUsingRecursion(sl.getHead());
		
//		System.out.println("After reverse");
//		sl.reverse();
//		sl.print();		
		
	}
}
