package com.java.basic;

public class JavaPalindrom {

public static void main(String[] args) {
			
			 int n = 131;
			 int r ;
			 int s = 0;
			 
			 int temp=n; 
			 
			 while(n>0) {
				 r=n%10; //getting remainder
				 s=(s*10)+r;
				 n=n/10;
				 
			 }
			 if(temp==s) {
				 System.out.println("Ïts Palindrom");
			 }else {
				 System.out.println("Its Not Palindrom");
			 }
			 
		}
 


}
