package com.java.basic;

public class Javaexamplesix {

	public static void main(String[] args) {

		int a[] = { 5, 6, 8, 57, 3, 6, 2, 5 };

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		for (int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		
	}

}
