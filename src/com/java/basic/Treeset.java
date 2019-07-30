package com.java.basic;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		TreeSet<Integer> Classification = new TreeSet<>();
//		<-Add value for TreeSet->
		Classification.add(1);
		Classification.add(441);
		Classification.add(41);
		Classification.add(2);
		Classification.add(4);
		System.out.println(Classification);
		System.out.println();


//		<--descending Order Print->
		Iterator<Integer> subclass = Classification.descendingIterator();
		while (subclass.hasNext()) {
			System.out.println(subclass.next());
		}

		System.out.println();
//		<--Max Value>
		System.out.println(Classification.pollLast());
		
//		<--Min Value->
		System.out.println(Classification.pollFirst());
		
//		<---Remove TreeSet Values->
		Classification.removeAll(Classification);
		System.out.println(Classification);

	}

}
