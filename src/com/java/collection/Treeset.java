package com.java.collection;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		Set<Integer> obj = new TreeSet<>();
		obj.add(2);
		obj.add(5);
		obj.add(9);
		obj.add(6);
		obj.add(1);
		
		System.out.print(obj);
		System.out.println();
		
		obj.add(5);
		System.out.print(obj);
		
		
		System.out.println();
		TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>(); 
		ts.add(new StringBuffer("Arun")); 
        ts.add(new StringBuffer("Zero")); 
        ts.add(new StringBuffer("Love")); 
        ts.add(new StringBuffer("Baby")); 
        ts.add(new StringBuffer(" "));
        ts.add(new StringBuffer(" "));
        ts.add(new StringBuffer("Ok")); 
        System.out.println(ts); 
		

	}

}
