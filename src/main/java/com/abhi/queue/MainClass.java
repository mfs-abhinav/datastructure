package com.abhi.queue;

public class MainClass {
	public static void main(String []args) {
				
		//queue call
		Queue q = new Queue();
		/*GenericQueue<Person> q = new GenericQueue<Person>();*/
		for(int i=0; i<6; i++) {
			q.enQueue(i * 2);
		}
		System.out.println("Items in queue after enqueue.....");
		q.showAll();
		
		for(int i=0; i<6; i++) {
			q.deQueue();
		}
		
		/*System.out.println("Items in queue after dequeue.....");*************/
		q.showAll();
		
		
		
			
	}
}

