package com.java.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class linkehasmapcollection {

	public static void main(String[] args) {
		
		Map<Integer,Integer>map = new TreeMap<>();
		map.put(0, 1);
		map.put(2, 3);
		map.put(5, 6);
		map.put(3, 6);
		map.put(2, 6);
		
		System.out.println();
		
		LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<>();
		hm.put(0, 2);
		hm.put(5, 2);
		hm.put(2, 2);
		hm.put(1, 2);
		hm.put(1, 2);
		
//		hm.putAll(map);
		System.out.println(" Key Out " + hm.keySet());
		System.out.println(" Values Out " +hm.values());
		System.out.println();
		
		
		System.out.println();
		
		HashMap<Integer,Integer>h=new HashMap<>();
		h.put(0, 2);
		h.put(5, 2);
		h.put(2, 2);
		h.put(1, 2);
		h.put(1, 2);
		
		
//		h.putAll(map);
		System.out.println("hashMap Out " + h);
		System.out.println();
		System.out.println("TreeMap Out"+ map);
		System.out.println();
		System.out.println("Linkedhashmap Out"+ hm);

	}

}
