package com.java.basic;

public class ArrayExample {

	public static void main(String[] args) {

//		<---2D Array Example->
		int abc[][] = new int[5][5];

		int count = 1;
		for (int row = 0; row < abc.length; row++) {
			for (int col = 0; col < abc.length; col++) {

				abc[row][col] = count;

				System.out.print(abc[row][col]);

				count++;
			}

			System.out.println();
		}

		System.out.println();

//		<--Jagged Array Example->
		int[][] ab = { { 1, 2, 3, }, { 4, 5, 6 }, { 1, 2, 3, 7 } };

		for (int row = 0; row < ab.length; row++) {
			for (int col = 0; col < ab[row].length; col++) {
				System.out.print(ab[row][col]);
			}

			System.out.print("\n");
		}

	}

}
