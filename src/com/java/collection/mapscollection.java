package com.java.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapscollection {

	public static void main(String[] args) {
	
		Map<Integer,Integer>map = new TreeMap<>();
		map.put(0, 1);
		map.put(2, 3);
		map.put(5, 6);
		map.put(3, 5);
		System.out.println("Ascending oder out " + map);
	     System.out.println("descendingMap: "+((TreeMap<Integer, Integer>) map).descendingMap());
	     System.out.println("headMap: "+((TreeMap<Integer, Integer>) map).headMap(2,true));
	     System.out.println("tailMap: "+((TreeMap<Integer, Integer>) map).tailMap(2,true));
	     System.out.println("subMap: "+((TreeMap<Integer, Integer>) map).subMap(1,true, 2, true));
	     
		System.out.println(map);
		for(@SuppressWarnings("rawtypes") Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println();
		
		for(Map.Entry<Integer,Integer>m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		Map<Integer,Integer> has = new HashMap<>();
		has.putAll(map);
		System.out.println(has);
		
		
		LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<>();
		hm.putAll(has);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		
	}

}
