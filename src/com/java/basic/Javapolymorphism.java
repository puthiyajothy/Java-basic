package com.java.basic;

public class Javapolymorphism {

	public static void main(String[] args) {

		Cal obj = new Cal();
		obj.show();
		System.out.println(obj.show(5, 4));
//		System.out.println(obj.show(5, 4, 4));
//
//		int avg = obj.show(4, 6) / 2;
//
//		System.out.println(avg);
//
//		avg(3, 5);
		
		Cal obj1 = new dance();
		System.out.println(obj1.showString());
		obj1.show();
		
		System.out.println(obj.showString());
		
		
		
		
		dance dan = new dance();
		dan.average();
		

	}
	
	

	public static void avg(int i, int j) {
		System.out.println(i + j);
	}

}

class Cal {
	public int show(int i, int j) {
		return i + j;
	}

	public int show(int i, int j, int k) {
		return i + j + k;
	}

	public void sum(int i, int j) {
		System.out.println(i + j);
	}
	
	public String showString() {
		return "Cal";
	}

	public void show() {
		System.out.println("ok");
	}

}

class dance extends Cal {
	
	public String showString() {
		return "Dance";
	}


	public int show(int i, int j) {
		return i + j;
	}
	
	public int avg() {
		return show(4, 2)/2;
	}
	
	public void average() {
		System.out.println(avg());
	}
	
}


