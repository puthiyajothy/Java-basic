package com.java.basic;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {

		String s1 = "jothi";
		String s2 = "";
		String s3 ="";

		// use StringBuffer//
		StringBuffer ab = new StringBuffer(s1);
		s2 = ab.reverse().toString();

		System.out.println(s2);
		
		
		
		// use for loop//
		System.out.println();
		
		int len = s1.length();
		
		for (int i = len - 1; i >= 0; i--) {
			s3 = s3 + s1.charAt(i);
		}

		System.out.println(s3);
		
		
		
		System.out.println();

		// Use Scanner//
		String original = null;
		String rev = "";

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values: ");
		original = sc.nextLine();

		int l1 = original.length();

		for (int i = l1 - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
	
		System.out.println(rev);
	}
}
