package com.java.basic;

public class JavainnerClass {

	public static void main(String[] args) {

		Test test = new Test();
		test.test();

//		Test.Move move = test.new Move();

		Test.Move move = new Test.Move();
		move.some();

	}

}

class Test {

	public void test() {
		System.out.println("test");
	}

	static class Move { // inner class
		public void some() {
			System.out.println("some");
		}
	}

}