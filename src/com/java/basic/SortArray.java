package com.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortArray {

	public static void main(String[] args) {
		
		Integer array [] = {2,5,2,5,6,6,8,6};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(" " +array[i]);
		}
		System.out.println();
		
		List<Integer>arraycal = new ArrayList<>(Arrays.asList(array));
		Set<Integer>arrayrow = new HashSet<>(arraycal);
		System.out.print(" "+ arrayrow);
	}

}
