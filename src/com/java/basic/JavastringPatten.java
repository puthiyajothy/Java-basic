package com.java.basic;

public class JavastringPatten {

	public static void main(String[] args) {
		
		String str ="navinreddy";
		String patten="reddy";
		
		 boolean result = str.contains(patten);
		if(result) 
			System.out.print("its found");
		else 
			System.out.print("its not found");
		
		System.out.println();	
		
		String str1 ="hellow"; //immutable String
		
		str1=str1 + "hi";
		System.out.print("result:"+ str1);

	}

}
