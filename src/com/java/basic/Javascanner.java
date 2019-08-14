package com.java.basic;

import java.util.Scanner;

public class Javascanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		student obj = new student(1,"jothi");
		System.out.print(" "+ obj);
		
		
		String s1,s2;
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		
		s1 = "apple";
		s2 = "APPLE";
		
		System.out.println(s1.length()); 
		System.out.println(s2.length());
		
		System.out.println("Print Upper case :" + s1.toUpperCase());
		System.out.println("Print Upper case: "+ s2.toLowerCase());
		s1=sc.nextLine();
		s2 = sc.nextLine();
		
		String s3 =s1.concat(s2);
		
//		String s3= s1;
			   s3= s2.intern();
		
		System.out.println("final values :" + s1.intern()+ " " + s2.intern());
		System.out.println("final intern :" + s3);
		
		System.out.println();
		

		

	

	}
	
	

}


class student {
	
	int id ;
	String name;
	
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	
	
//	 public String toString() {
//		return name + id;
//		 
//	 }
	
}
