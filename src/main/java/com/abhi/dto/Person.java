package com.abhi.dto;

public class Person {
	private String name;
	private int rollno;
	
	public Person(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
	public String toString() {
		return "Name: " + this.name + " RollNo: " + this.rollno;
	}
}
