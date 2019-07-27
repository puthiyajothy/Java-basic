package com.java.basic.exception;

public class Custom_exception {

	public static void samplemethod(int i) throws InvalidNumberException {
		if (i < 20) {
			System.out.println("Number ok");
		} else {
			throw new InvalidNumberException("number is to large");
		}

	}

	public static void sampletwo(String i) throws InvalidNumberException {
		if (i.equals("ABC")) {
			System.out.println("ok");
		} else {
			throw new InvalidNumberException("wrong");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int i = 10;
		try {
//			samplemethod(i);
			sampletwo("ABC");
		} catch (InvalidNumberException e) {
			e.printStackTrace();
		}

	}

}
