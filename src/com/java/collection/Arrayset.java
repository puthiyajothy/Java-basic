package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Arrayset {

	public static void main(String[] args) {
	
		
		List<Integer>list= new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		System.out.println("Arrays Out:" + list);
		
		Iterator<Integer> inter = list.iterator();
		while(inter.hasNext()) {
			System.out.println(inter.next());
		}
		
		List<Integer>linked= new LinkedList<>();
		linked.addAll(list);
		System.out.println("Linked out:" +linked);
		
		Set<Integer>set= new HashSet<>();
		set.addAll(list);
		System.out.println("HashSet out:"+ set);
		
		HashSet<Integer> hset = new HashSet<>();
		hset.addAll(list);
		System.out.println("Hashset Out" + hset);
		
		Set<Integer>treeset= new TreeSet<>();
		treeset.addAll(list);
		System.out.println("TreeSet out"+ treeset);
	}

}
