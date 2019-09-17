package com.java.sortting;

public class Sample {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Apple.b=2;
		Apple obj = new Apple();
		obj.test(2,"j0");
		obj.test(20, "thi");
		System.out.println(obj.toString());
		
	}

}

class Apple{
	
	public static int b=0;
	
	public int test(Integer n1,String n2) {
		return n1;
	
	}

	public int orange(Integer n2, String n5 ) {
		return n2;
		
	}
	
	
	
}