package com.java.basic;

public class JavaStart3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=8;i++) {
//			for(int k=1;k)
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
		System.out.println();
		
		for(int i=8;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
