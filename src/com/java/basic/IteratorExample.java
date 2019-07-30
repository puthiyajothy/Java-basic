package com.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {

		List<Integer> mainclas = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7, 90));
		System.out.println(mainclas);

		List<Integer> mainclass = new ArrayList<>();
		mainclass.add(2);
		mainclass.add(4);
		mainclass.add(5);

		System.out.println();
		Iterator<Integer> iterator = mainclass.iterator();

		while (iterator.hasNext()) {

			if (iterator.next() == 5) {
				iterator.remove();
			}

		}

		System.out.println(mainclass);
	}

}
