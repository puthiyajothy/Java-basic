package com.java.basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListExample {

	public static void main(String[] args) {

		List<Integer> abc = new ArrayList<>();

		abc.add(1);
		abc.add(2);
		abc.add(3);
		abc.add(4);

		System.out.print(abc);

		abc.set(0, 5);
		abc.set(3, 10);
		System.out.println(abc);

		abc.remove(0);
		abc.remove(2);
		System.out.println(abc);

		System.out.print("\n");

		Map<Integer, String> abcd = new HashMap<>();

		abcd.put(1, "jothi");
		abcd.put(2, "age");
		abcd.put(3, "student");
		System.out.print(abcd);

		System.out.println();
		abcd.remove(1);
		System.out.print(abcd);

		System.out.println();

		int Studentdetails[] = { 1, 4, 3 };
		String StudentDep[] = { "ICT", "CSC", "BSC" };

		Map<Integer, String> abcde = new HashMap<>();

		for (int i = 0; i < Studentdetails.length; i++) {

			abcde.put(Studentdetails[i], StudentDep[i]);
		}

		System.out.print(abcde + "\n");

		for (Map.Entry<Integer, String> stu : abcde.entrySet()) {
			System.out.println(stu.getKey() + "\t" + stu.getValue());
		}
		System.out.println();

		System.out.print(abcde + "\n");

		abcde.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
				.forEach(System.out::println);
		
		System.out.print(abcde + "\n");
		
		abcde.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}


}
