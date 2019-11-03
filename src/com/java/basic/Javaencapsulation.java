package com.java.basic;

public class Javaencapsulation {

	public static void main(String[] args) {

		D obj = new D();
		obj.setI(5);
		System.out.println(obj);
		System.out.println(obj.getI());
		
		
		
		F r = new F();
		r.Test();
		r.dance();

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



class R{
	public void Test() {
		System.out.println("Testing");
	}
}

class F extends R{
	public void dance() {
		System.out.println("Dancing");
	}
	
	public void Test() {
//		System.out.println("Pakki");
		super.Test();
	}
	
	
}