package com.java.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
	
		
		 Set<Integer> set = new HashSet<>();
		 
//		 List<Set<Integer>>array = Arrays.asList(set);
		 
		 
		 set.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 9}));
		 
		 Set<Integer> sethas = new HashSet<Integer>();
		 sethas.addAll(Arrays.asList(new Integer[] {1, 3, 4, 5, 2, 0, 4}));
		 
		 System.out.print("Result1:"+ set);
		 System.out.println();
		 System.out.print("Result2:"+ sethas);
		 System.out.println();
		 
		 
		 Set<Integer> union = new HashSet<>(set);
		 union.addAll(sethas);
		 System.out.print("Union of the two Set" + union); 
		 
		 System.out.println();
		 Set<Integer>a= new HashSet<>(set);
		 a.retainAll(sethas);
		 System.out.print("Intersection of the two Set"+a);
		 
		 System.out.println();
		 Set<Integer> difference  = new HashSet<>(set);
		 difference.removeAll(sethas);
		 System.out.println(difference );
		 
		 

	}

}
