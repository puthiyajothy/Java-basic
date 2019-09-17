package com.java.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OccurrenceLinkedlist {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(9);
		list.addLast(70);
		list.add(20);
		list.addFirst(80);

		System.out.print(list);

		boolean returnValue = list.removeFirstOccurrence(10);
		System.out.println();
		System.out.print(returnValue);
		System.out.println();
		System.out.print("result :" + list);
		System.out.println();
		System.out.print(list.set(0, 30));
		System.out.print(list);

		System.out.println();
		list.removeFirst();
		System.out.print("First Removed :" + list);

		System.out.println();
		list.removeLast();
		System.out.print("Last Removed :" + list);

		System.out.println();

		System.out.println();

		List<Integer> obj = Arrays.asList(1, 2, 6, 3, 5);

		LinkedList<Integer> obj1 = new LinkedList<>();
		obj1.addAll(obj);
		@SuppressWarnings("rawtypes")
		Iterator iter = obj1.descendingIterator();
		while (iter.hasNext()) {
			System.out.print(" " + iter.next());
		}

	}

}
