package com.abhi.stack;

import java.util.ArrayList;
import java.util.List;

public class StackCollection<E> {
	private List<E> items;
	
	public StackCollection() {
		items = new ArrayList<E>();
	}
	
	public void push(E item) {
		items.add(item);
	}
	
	public E pop() {
		if (! items.isEmpty()) {
			return items.remove(size()-1);
		} else {
			throw new StackEmptyException("Stack is empty");
		}
	}
	
	private int size() {
		return items.size();
	}
}
