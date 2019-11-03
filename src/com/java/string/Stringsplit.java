package com.java.string;

public class Stringsplit {

	public static void main(String[] args) {
		
		String str = "my name is jothi";
		String name[] = str.split("\\s ");
		for(String val:name) {
			System.out.println(val);
		}
		
		
		

	}

}
