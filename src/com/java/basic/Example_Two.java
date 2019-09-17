package com.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example_Two {

	public static void main(String[] args) {
		
		Integer[] mainclass = {2,4,6,7,1,3};
		
//		Integer subclass[] = {6,9,5,4,7,3};
		
		List<Integer> list = Arrays.asList(mainclass);
		
		
		
		Set<Integer> set = new TreeSet<>(list);
		for(Integer var :set)
		
		System.out.print(var);
		System.out.println();
		
	
		Integer a []= {1,9,2,9,9,6};
		ArrayList<Integer> abc = new ArrayList<>(Arrays.asList(a));
		abc.remove(1);
		System.out.print(abc);
		

	}
}
