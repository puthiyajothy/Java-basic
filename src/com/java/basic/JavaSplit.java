package com.java.basic;

public class JavaSplit {

	public static void main(String[] args) {
		
		String str = "tyrone,jothi,Aji,sutha,keerthi";
		
		String names[] =str.split(",");
		
		for(String val : names)
		System.out.print(" "+val);
		
		System.out.println();

		System.out.println();
		String s1 ="tyronne";
		
		
		s1=s1.concat("navin");
		System.out.println(s1);
		System.out.println(s1.concat("navin"));
//		System.out.println(s2);
		
	}
	


}
