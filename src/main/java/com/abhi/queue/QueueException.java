package com.abhi.queue;

public class QueueException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QueueException() {
		super();
	}
	
	public QueueException(String message) {
		System.out.println(message);
	}
}
