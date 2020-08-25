package com.abhi.stack;

import com.abhi.dto.Person;

public class MainClass {
	public static void main(String []args) {
		// Stack call
		//Stack stack = new Stack();
		StackCollection<Person> stack = new StackCollection<Person>();
		for(int i=0; i<50; i++) {
			Person obj = new Person("Abhinav" + i, i);
			stack.push(obj);
		}
		for(int j=0; j<50; j++) {
			System.out.println(stack.pop().toString());
		}
		
	}
}
