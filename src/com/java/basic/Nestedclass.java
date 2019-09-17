package com.java.basic;

public class Nestedclass {

	public static void main(String[] args) {

		abcd obj = new abcd();
		obj.test();
		System.out.println();
	
		
		

	}

}

class abcd {
	
	public void test() {
		System.out.print("helow...");
	}
	
	class Apple{
		public void  dance() {
			System.out.print("I Am Apple..");
		}
	}
	
}