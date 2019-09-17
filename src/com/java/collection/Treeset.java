package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		TreeSet<Integer> obj = new TreeSet<>();
		obj.add(2);
		obj.add(5);
		obj.add(9);
		obj.add(6);
		obj.add(1);

		System.out.println(obj.descendingSet());

		Iterator<Integer> iter = obj.descendingIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.print(obj);
		System.out.println();

		obj.add(5);
		System.out.print(obj);
		System.out.println();

		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(0);
		set.add(3);

//		set.addAll(obj);
		System.out.println("SET");
		System.out.println();
		Set<Integer> sset = new LinkedHashSet<>();
		sset.add(1);
		sset.add(2);
		sset.add(6);
		sset.add(0);

		Iterator<Integer> inter = sset.iterator();
		while(inter.hasNext()) {
			System.out.println(inter.next());
		}
		
		System.out.println("HashSet Out " + set);
		System.out.println("TreeSet Out" + obj);
		System.out.println("LinkedHashSet Out" + sset);

	}

}
