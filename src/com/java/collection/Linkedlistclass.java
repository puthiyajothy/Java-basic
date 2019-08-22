package com.java.collection;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistclass {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		List<Integer>obj1 = new LinkedList<>();
		obj1.add(5);
		obj1.add(2);
		obj1.add(5);
		
		System.out.print(obj1);
		
		System.out.println();
		
		obj1.remove(1);
		System.out.print(obj1);
		
		System.out.println();
		obj1.add(1, 3);
		System.out.print(obj1);
		
		System.out.println();
		obj1.contains(obj1.add(9));
		obj1.contains(obj1.add(8));
		obj1.contains(obj1.add(5));
		System.out.print("result"+obj1);

	}

}
