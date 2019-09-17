package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(12);
		set.add(10);
		set.add(12);
		System.out.print(set);
		System.out.println();
		
		Iterator<Integer> itr= set.iterator();  
		  while(itr.hasNext()){ 
			  
			  
		   System.out.print(" " +itr.next());  
		  }  
		  
		  
		  

	}

}
