package com.abhi.queue;

import java.util.ArrayList;
import java.util.List;

public class GenericQueue<E> {
	private List<E> items;
	
	public GenericQueue() {
		items = new ArrayList<E>();
	}
	
	public void enQueue(E item) {
		items.add(item);
	}
	
	public E deQueue() {
		if(! items.isEmpty()) {
			E item = items.get(0);
			items.remove(0);
			return item;
		} else {
			throw new QueueException("Queue is empty");
		}
	}
	
	public void showAll() {
		for(int i=0; i<items.size();i++) {
			System.out.println(items.get(i));
		}
	}
}
