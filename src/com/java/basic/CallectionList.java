package com.java.basic;

import java.util.ArrayList;
import java.util.List;

public class CallectionList {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		List<Integer> cal = new ArrayList();
		cal.add(10);
		cal.add(5);
		cal.add(6);

		System.out.println(cal);

		System.out.println();

		int a[] = { 1, 5, 7, 3, 6, 8 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
