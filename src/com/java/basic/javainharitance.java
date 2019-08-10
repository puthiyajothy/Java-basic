package com.java.basic;

//IS-A , HAS-A

class calculator { // super class

	public int add(int i, int j) {
		return i + j;
	}
	
}

class Advcal extends calculator { // sub Class
	public int sub(int i, int j) {
		return i - j;

	}
}

class VeryAdvcal extends Advcal {
	public int multi(int i, int j) {
		return i * j;

	}
}

public class javainharitance {

	public static void main(String[] args) {

		VeryAdvcal cal = new VeryAdvcal();
		int result1 = cal.add(5, 4);
		int result2 = cal.sub(9, 5);
		int result3 = cal.multi(2, 5);
		int result4 = cal.add(5, 3);
		
//		Advcal obj2 = new Advcal();
//		int result4 =obj2.add(5, 2);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		

	}

}
