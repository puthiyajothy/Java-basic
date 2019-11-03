package com.java.logisc;

public class Javareverse {

	public static void main(String[] args) {

		int[]  str = {2,4,5,6,8,9};
		
		for(int i=0;i<str.length;i++) {
			System.out.print(" " + str[i]);
		}
		
		System.out.println();
		
		for(int j=str.length-1;j>=0;j--) {
			System.out.print(" " + str[j]);
		}

		System.out.println();
		
		 int i=1;
		 while(i<=10) {
			 System.out.print(i);
			 i++;
		 }
		 
		 System.out.println();
		 
		 for(int j=0;j<=10;j++) {
			 if(j==5) {
				 break;
			 }
			 
			 System.out.print(j);
		 }
		 
		 
	}

}
