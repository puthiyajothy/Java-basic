package com.java.basic;

public class ArrayDemo {

	public static void main(String[] args) {

		int num[] = new int[3];

		num[0] = 1;
		num[1] = 2;
		num[2] = 3;

		System.out.println(num[1]);

		System.out.println();
		int a[] = { 52, 23, 41, 3, 56, 77, 8, 3, 22, 555, 99, 44, 33 };
		System.out.println("Array Values");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int temp = 0;

		// Descending Orderxz
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		System.out.println();
		System.out.println("Descendin Order: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		
		System.out.println();

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}
		}
		System.out.println(max);

		System.out.println();

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];

			}

		}
		System.out.println(min);

		System.out.println();
		System.out.println();
		for (int i = 0; i < 20; i++) {
			if (i < 14) {
				System.out.print(i + " ");
			} else {
				break;
			}
		}

	}

}
