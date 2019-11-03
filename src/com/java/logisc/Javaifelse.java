package com.java.logisc;

import java.util.Scanner;

public class Javaifelse {

	public static void main(String[] args) {

		int num = 9;

//		if (num > 0) {
//			System.out.println("Number is positive");
//		}
//
//		System.out.println("This statement is always executed.");
//
//		System.out.println();

		if (num > 0) {
			System.out.println("Number is positive");
		} else if (num < 0) {
			System.out.println("Number is negative.");
		} else {
			System.out.println("Number is 0");
		}

		System.out.println();

		for (int i = 1; i <= 10; i++) {
			System.out.print(" " + i);
		}

		System.out.println();
//		 System.out.println("Enter a character :");
//	      Scanner sc = new Scanner(System.in);
//	      char ch = sc.next().charAt(0);

		String str = "B";
		char ch;
		for (int j = 0; j < str.length(); j++) {
			ch = str.charAt(j);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println("its vawels elemet");

			} else {
				System.out.println("ïts not element");
			}
		}
		
		System.out.println();
		
		for (int i = 1; i <= 10; ++i) {      
	         if (i == 5) {
	            break;
	         }      
	         System.out.print(" " + i);
	      }  
		
		System.out.println();
		
		 for (int i = 1; i <= 10; ++i) {      
	         if (i > 4 && i < 9) {
	            continue;
	         }      
	         System.out.print(" "+ i);
	      }   
		 
		 System.out.println();
		 int[] number = {1,4,5,6,8};
		 
//		 int[] age=number;
		 
		 for(int number1:number) {
			 System.out.print(number1);
			 
		 }

		System.out.println();

		int[][] abc = new int[3][3];
//		int[][] x = { { 1, 2, 3, 4 }, { 4, 5, 6 }, { 1, 2, 3, 7, 8, 9 } };

		int count = 1;
		for (int row = 0; row < abc.length; row++) {
			for (int col = 0; col < abc.length; col++) {
				abc[row][col] = count;
				System.out.print(abc[row][col] + " ");

				count++;
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] y = { { 1, 2, 3, 4 }, { 4, 5, 6 }, { 1, 2, 3, 7, 8, 9 } };

		for (int row = 0; row < y.length; row++) {
			for (int col = 0; col < y[row].length; col++) {

				System.out.print(y[row][col]);
			}
			System.out.println();
		}

	}

}
