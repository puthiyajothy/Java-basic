package com.java.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example_one {
	
	public static void main(String[] args) {

		Integer a[] = {4,3,1,6,4,3,6,4};
		@SuppressWarnings("unused")
		int b[] = {4,5,6,8,9};
//		int b[][] = new int [a.length][2];
		
	
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j]) {
					
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			System.out.println(a[i]);
			
		}
		
		
		
		System.out.println();
		
		List<Integer> list = Arrays.asList(a);
		Set<Integer> set = new TreeSet<>(list);
//		for(Integer var: set)
		System.out.println("TreeSet Out");
		System.out.println(set);
		
		System.out.println();
		System.out.println("Collection Out");
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println("Collection Reverse");
		System.out.println(list);
		
	}
	
	
	
}
