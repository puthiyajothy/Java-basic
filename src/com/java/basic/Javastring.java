package com.java.basic;

public class Javastring {

	public static void main(String[] args) {

		String s = ("jothi");
		s.concat("jo");
		System.out.print(s);
		
		System.out.println();
		
		System.out.println(s.concat("dilu" + "concat:"));
		System.out.println();
		System.out.println(s.compareTo("j"));
		
		System.out.println(s.replace("jothi", "dilu" + "Replace :"));
		System.out.println();
		
		System.out.println(  " intern :" + s.intern());
		
		System.out.println();
		System.out.println(s.equals("equals:" + s));
		
		System.out.println();
		System.out.println(s.length() + " Length");
		
		System.out.println();
		System.out.println(s.split(s));
	
	
		System.out.println();
		
		
		
	}

}
