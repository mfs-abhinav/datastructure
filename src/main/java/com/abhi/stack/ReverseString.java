package com.abhi.stack;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = in.next();
		
		in.close();
		
		StackDS dataStr = new StackDS(str.length());
		
		for(int i = 0; i < str.length(); i++) {
			dataStr.push(str.charAt(i));
		}
		
		for(int j = 0; j < str.length(); j++) {
			System.out.print(dataStr.pop());
		}
	}

}

class StackDS {
	private char[] stackArr;
	private int top;
	private int size;
	
	public StackDS() {
		this.top = -1;
		this.size = 50;
		this.stackArr = new char[this.size];
	}
	
	public StackDS(int size) {
		this.top = -1;
		this.size = size;
		this.stackArr = new char[this.size];
	}
	
	public boolean isFull() {
		return (this.top == this.size-1);
	}
	
	public boolean isEmpty() {
		return (this.top == -1);
	}
	
	public boolean push(char item) {
		if (!isFull()) {
			this.top++;
			this.stackArr[top] = item;
			return true;
		} else {
			return false;
		}
	}
	
	public char pop() {
		return this.stackArr[this.top--];
	}
}
