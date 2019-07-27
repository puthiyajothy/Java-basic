package com.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Javalist {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);

		System.out.println(num);

		num.set(1, 100);
		num.set(2, 200);
		num.set(1, 250);
		System.out.println(num);

		num.remove(2);
		System.out.println(num);

		num.add(130);
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);

		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

		Iterator<Integer> numIterator = numList.iterator();
		System.out.println("List iterate integer elements : ");
		while (numIterator.hasNext()) {
			System.out.print(numIterator.next() + " ");
		}

	}

}
