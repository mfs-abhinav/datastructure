package com.abhi.stack;

public class StackEmptyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackEmptyException() {
		super();
	}
	
	public StackEmptyException(String message) {
		System.out.println(message);
	}
}
