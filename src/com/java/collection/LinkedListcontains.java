package com.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListcontains {

	public static void main(String[] args) {
		List<Integer> obj = new LinkedList<>();
		obj.add(1);
		obj.add(5);
		obj.add(8);
		obj.add(10);
		
		System.out.print("Listresult"+obj);
		System.out.println();
		System.out.print("contains :"+ obj.contains(10));
		System.out.println();
		System.out.print("contains :"+ obj.contains(3));
		
		System.out.println();
		
		List<Integer> obj1 = new ArrayList<>();
		obj1.add(5);
		obj1.add(6);
		obj1.add(9);
		System.out.print(obj1);
		System.out.println();
		System.out.print("Arrya contains: "+ obj1.contains(5));
		System.out.println();
		System.out.print("Arrya contains: "+ obj1.contains(10));
	}

}
