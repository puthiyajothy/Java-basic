package com.java.string;

import java.util.Scanner;

public class Findlength {

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 String");
		s1=sc.nextLine();
		s2=sc.nextLine();
		int l1=s1.length();
		
		
		String s3 = s1.concat(s2); //+ also used
		System.out.println(s3);
		System.out.println(l1);
		
		//step 3
//		String s4= "jothi";
//		String s5 = s4.toUpperCase();
		String s5 = s1.toUpperCase();
		System.out.println(s5);
		
	}

}
 