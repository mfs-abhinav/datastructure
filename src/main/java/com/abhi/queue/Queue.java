package com.abhi.queue;

public class Queue {
	private int[] items;
	private int size;
	private int front;
	private int rear;
	private int totalItem;
	
	public Queue() {
		this.size = 5;
		items = new int[this.size];
		this.front = 0;
		this.rear = 0;
		this.totalItem = 0;
	}
	
	public Queue(int size) {
		this.size = size;
		items = new int[size];
		this.front = 0;
		this.rear = 0;
		this.totalItem = 0;
	}
	
	public boolean isFull() {
		return (size == totalItem);
	}
	
	public boolean enQueue(int item) {
		if (isFull()) {
			return false;
		} else {
			items[rear] = item;
			rear = (rear+1) % size;
			totalItem++;
			return true;
		}
	}
	
	public int deQueue() {
		int item = items[front];
		front = (front+1) % size;
		totalItem--;
		return item;
	}
	
	public void showAll() {
		int f = front;
		for(int i=0; i<totalItem; i++) {
			System.out.println(items[f]);
			f = (f + 1) % size;
		}
	}
}
