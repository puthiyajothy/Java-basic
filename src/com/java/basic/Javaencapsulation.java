package com.java.basic;

public class Javaencapsulation {

	public static void main(String[] args) {

		D obj = new D();
		obj.setI(5);
		System.out.println(obj);
		System.out.println(obj.getI());

	}

}

class D{

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
