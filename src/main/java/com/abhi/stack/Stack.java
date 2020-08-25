package com.abhi.stack;

import com.abhi.dto.Person;

public class Stack {
	private Person[] person;
	private int top;
	private int size;
	
	public Stack() {
		this.top = -1;
		this.size = 50;
		this.person = new Person[this.size];
	}
	
	public Stack(int size) {
		this.top = -1;
		this.size = size;
		this.person = new Person[this.size];
	}
	
	public boolean isFull() {
		return (this.top == this.size-1);
	}
	
	public boolean isEmpty() {
		return (this.top == -1);
	}
	
	public boolean push(Person item) {
		if (!isFull()) {
			this.top++;
			this.person[top] = item;
			return true;
		} else {
			return false;
		}
	}
	
	public Person pop() {
		return this.person[this.top--];
	}
}
