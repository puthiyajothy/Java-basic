package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertArray {
	

	@SuppressWarnings("unused")
	private static List<Integer> convertALtoLL(List<Integer> aL) {
		List<Integer> linkedobj = new LinkedList<>();
		linkedobj.addAll(aL);
		return linkedobj;
	}

	public static void main(String[] args) {

		List<Integer> aL = Arrays.asList(1, 2, 5, 3);
		
		System.out.print("array result" + aL);
		System.out.println();

		
		List<Integer> linkedobj = new LinkedList<>();
		linkedobj.addAll(aL);
		System.out.print("ConvertArry: " + linkedobj);
		
		
		
		
		
		

	}

	

}
