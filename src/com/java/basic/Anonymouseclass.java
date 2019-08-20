package com.java.basic;

public class Anonymouseclass {

	public static void main(String[] args) {

		Cool cool = new Cool() {

			public void test() {
				System.out.print("hi Dilu");

			}
		};
		cool.test();

	}

}

class Cool {

	public void test() {
		System.out.print("hi tyronne");

	}
}

//class move extends Cool {
//	
//	@Override
//	
//	
//}