package com.java.collection;

import java.util.LinkedHashSet;

public class Linkedhashmap {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		linkedset.add("A");
		linkedset.add("Z");
		linkedset.add("C");
		linkedset.add("D");
		linkedset.add("A");
		linkedset.add(" ");
		linkedset.add(" ");
		linkedset.add(" ");
		System.out.println(linkedset);
		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("S"));
		System.out.println("Checking if A is present=" +  linkedset.contains("A"));
		System.out.println("Updated LinkedHashSet: " + linkedset);

	}

}
