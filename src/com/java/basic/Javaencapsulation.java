package com.java.basic;

public class Javaencapsulation {

	public static void main(String[] args) {

		A obj = new A();
		obj.setI(5);
		System.out.println(obj);
		System.out.println(obj.getI());

	}

}

class A {

	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String toString() {
		return i + "";

	}

}
