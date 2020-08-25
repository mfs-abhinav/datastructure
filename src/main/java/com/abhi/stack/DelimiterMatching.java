package com.abhi.stack;

import java.util.Scanner;

public class DelimiterMatching {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter expression to validate: ");
		String str = in.next();
		
		in.close();
		//a[b{c}d]e}
		//a{b[c]d}e
		StackContainer dataStr = new StackContainer(str.length());
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			switch(ch) {
				case '{':
				case '(':
				case '[':
					dataStr.push(ch);
					break;
					
				case '}':
				case ')':
				case ']':
					if (! dataStr.isEmpty()) {
						char chx = dataStr.pop();
						if ((ch == '{') && (chx != '}') ||
							(ch == '(') && (chx != ')') ||
							(ch == '[') && (chx != ']')) {
							
							System.out.println("Error " +ch+ "at " + i);
						}
					} else {
						System.out.println("Error " +ch+ "at " + i);
					}
					break;
					
				default:
					break;
			}
		}
		
		if (! dataStr.isEmpty()) {
			System.out.println("Error: some missing delimiter");
		} else {
			System.out.println("Success: all delimiter matches");
		}
	}

}

class StackContainer {
	private char[] stackArr;
	private int top;
	private int size;
	
	public StackContainer() {
		this.top = -1;
		this.size = 50;
		this.stackArr = new char[this.size];
	}
	
	public StackContainer(int size) {
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
