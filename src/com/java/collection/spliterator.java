package com.java.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class spliterator {

	public static void main(String[] args) {

		List<Integer> obj = Arrays.asList(1, 2, 6, 3, 5);

		LinkedList<Integer> obj1 = new LinkedList<>();
		obj1.addAll(obj);
		System.out.println("Out "+ obj);
		
		 // using spliterator() method 
        Spliterator<Integer> numbers = obj.spliterator();
        
        System.out.print(numbers.estimateSize());
     
       

	}

}
