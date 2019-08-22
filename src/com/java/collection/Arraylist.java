package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		List<Integer> obj = new ArrayList<>();
		obj.add(1);
		obj.add(2);
		obj.add(5);

		System.out.print(obj);

		System.out.println();

		obj.remove(1);
		System.out.print(obj);

		System.out.println();
		obj.add(1, 3);
		System.out.print(obj);
		
		System.out.println();
		obj.contains(obj.add(4));
		System.out.print("Result "+obj);
		
		System.out.println();
		
		List<List<Integer>> array = Arrays.asList(obj);
		
		System.out.print(array);
		
		System.out.println();
		
		
	}

	


	

}

