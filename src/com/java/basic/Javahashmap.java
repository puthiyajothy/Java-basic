package com.java.basic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Javahashmap {

	public static void main(String[] args) {
	
		
		int a []= {1,2,3,4,1,2,3,4,5,5};
//		int b []= new int [a.length];
		
		int max =a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]> max) {
				
				max=a[i];
			}
			
		}
		System.out.print(max);
		
		System.out.println();
		
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.print(min);
		System.out.println();
		
		String[] array = {"name1","name2","name3","name4", "name5", "name2"};
		Arrays.stream(array)
		      .collect(Collectors.groupingBy(s -> s))
		      .forEach((k, v) ->
		      System.out.println(k+" "+v.size()));
		
		
		System.out.println();
		
		@SuppressWarnings("unused")
		int cal []= {3,5,7,8,9,1,3};
		
	}

}
