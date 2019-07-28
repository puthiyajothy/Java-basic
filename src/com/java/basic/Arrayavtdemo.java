package com.java.basic;

public class Arrayavtdemo {

	public static void main(String[] args) {

		int[][] abc = new int[5][5];

//		abc[0][1]=0;
//		abc[1][1]=1;
//		abc[2][1]=2;

		int count = 1;
		for (int row = 0; row < abc.length; row++) {
			for (int col = 0; col < abc.length; col++) {
				abc[row][col] = count;
				System.out.print(abc[row][col] + " ");

				count++;
			}
			System.out.println();
		}
//		System.out.print(abc[1][1]);

		System.out.println();

		int[][] x = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		System.out.print(x[1][1]);

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x.length; col++) {
				System.out.print(x[row][col]);
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
