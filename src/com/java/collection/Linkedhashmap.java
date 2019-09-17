package com.java.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

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
		
		System.out.println();
		Map<String, String> mapLang = new TreeMap<>();
		mapLang.put("c", "C");
		mapLang.put(".java", "Java");
		mapLang.put(".pl", "Perl");
		mapLang.put(".cs", "C#");
		mapLang.put(".php", "PHP");
		mapLang.put(".cpp", "C++");
		mapLang.put(".xml", "XML");
		System.out.println(mapLang);
		
		
		for(Entry<String, String> i : mapLang.entrySet()) {
			System.out.println(i.getKey() + " " +  i.getValue());
		}
		
		
		@SuppressWarnings("unused")
		List<Integer>list=new ArrayList<>();
		
		

	}
	
	
	
	

}
