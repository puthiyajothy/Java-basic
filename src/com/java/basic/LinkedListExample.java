package com.java.basic;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Integer> mainclass = new LinkedList<>();
		
//		<--Add Values->
		mainclass.add(1);
		mainclass.add(2);
		mainclass.add(9);
		mainclass.add(6);
	

		System.out.println(mainclass);

		System.out.println();

//		<-- Descending Order-->
		Collections.sort(mainclass, Collections.reverseOrder());
		System.out.println(mainclass);

		System.out.println();
		
//		<--Sorted Values--->
		Collections.sort(mainclass);

		System.out.println();
		
		
	}

}
