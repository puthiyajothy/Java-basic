package com.java.basic.exception;

@SuppressWarnings("serial")
public class InvalidNumberException extends Exception {
	
	public InvalidNumberException(String In) {
		super(In);
	}

	public InvalidNumberException() {
		super();
	}
	
	

}
