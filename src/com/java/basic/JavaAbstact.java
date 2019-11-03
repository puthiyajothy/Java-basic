package com.java.basic;

public class JavaAbstact {

	public static void main(String[] args) {
		Maheshphone obj = new Maheshphone();
		obj.call();
		obj.cook();
		obj.move();
		obj.dance();

	}
}

class Maheshphone extends sureshphone { //concrete class

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub

	}

}

abstract class sureshphone extends phone { //abstract class

	public void dance() {
		System.out.println("dancing....");
	}
}


abstract class phone { //abstract class

	public void call() {
		System.out.println("calling...");
	}

	public abstract void move();

	public abstract void cook();

	public abstract void dance();

}
