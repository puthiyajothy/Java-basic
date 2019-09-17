package com.java.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collectionmap {

	public static void main(String[] args) {
	
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 12);
		map.put(0, 11);
		map.put(3, 12);
		map.put(2, 13);
		System.out.println("Out" + map);
		
	     System.out.println(map.containsKey(1));
	   
		
		for(Map.Entry<Integer, Integer> maps: map.entrySet()) {
			System.out.println(maps.getKey() + "\t" + maps.getValue());
		}
		
		
		Map<Integer, Integer> maps = new HashMap<>();
		maps.putAll(map);
		System.out.println(maps);
		for(Map.Entry<Integer, Integer>mapz:maps.entrySet()) {
			System.out.println(mapz.getKey() + " " + mapz.getValue());
			
			
		}
		
		List<Integer> list= Arrays.asList(1,3,6,8);
		Set<Integer>set= new HashSet<>();
		set.addAll(list);
		System.out.println("Set Out "+set);
		
//		for(Integer sset:list) {
//			System.out.println(sset);
//		}
		
		 
		
		Iterator<Integer> its = set.iterator();


		while(its.hasNext()) {
			System.out.println(its.next());
		}
		
		System.out.println();
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
