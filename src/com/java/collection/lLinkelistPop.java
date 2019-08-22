package com.java.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class lLinkelistPop {

	public static void main(String[] args) {
		
		LinkedList<Integer> stack = new LinkedList<>();
		stack.push(10);
		stack.push(20);
		
		stack.push(60);
		
		System.out.print("Linkedlist "+ stack);
		
		System.out.println();
		
		stack.pop();
		System.out.print(stack);
		System.out.println();
		
		stack.peek();
		System.out.print(stack);
		
		System.out.println();
		
		
		
		
		List<LinkedList<Integer>> obj = Arrays.asList(stack);
		System.out.print("Linked out "+ obj);
		
	
		
		
		
		
		
		
	}

}
