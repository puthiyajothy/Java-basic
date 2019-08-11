package com.java.basic;

public class JavaStar4 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= 6; j++) {
				if (i == 1 || i == 6 || j == 1 || j == 6)
					System.out.print("* ");
				else if (i == 3 && j == 3)
					System.out.print("Ty");
				else
					System.out.print("  ");

			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 1 || i == 4 || j == 1 || j == 9)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}

		System.out.println();
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<10;j++) {
				if(i==j||i+j==10)
				System.out.print("* ");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	
	}

}
