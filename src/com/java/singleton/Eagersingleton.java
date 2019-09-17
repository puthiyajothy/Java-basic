package com.java.singleton;

public class Eagersingleton {

	public static void main(String[] args) {
		Apple.getInstance();
		Apple.getInstance();

	}

}

class Apple {

	public void dance() {
		System.out.println("Dancing.. ");
	}

	static Apple apple = new Apple();// Eager Instance

	public static Apple getInstance() {
		return apple;
	}

	private Apple() {
		System.out.println("Const Created..");

	}

}
