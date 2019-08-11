package com.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Classification {

	private int id;
	private String name;

	public Classification() {
		super();
	}

	public Classification(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + " " + name;

	}
}

public class HashList {

	public static void main(String[] args) {
		List<Integer> Student = new ArrayList<>(Arrays.asList(11, 72, 63, 63, 54));

		Student.add(1);
		Student.add(3);
		Student.add(3);
		Student.add(4);

		System.out.println(Student);

		Set<Integer> abcd = new HashSet<>(Student);

		System.out.println(abcd);

		Student.removeAll(Student);

		abcd.remove(63);
		System.out.println(abcd);

		System.out.println();

		Classification classOb = new Classification();
		classOb.setId(1);
		classOb.setName("abc");
		System.out.println(classOb);

		System.out.println();
		
		Set<Classification> classObj = new HashSet<Classification>();

		classObj.add(new Classification(1, "Jothi"));
		classObj.add(new Classification(2, "Keerthi"));
		System.out.println(classObj);

		System.out.println();

		for (Classification classList : classObj) {
			classList.getId();
			classList.getName();
			System.out.println(classList);
		}
		
		System.out.println();
		
		Integer givenarray[]= {1,2,1,3,5};
		List<Integer>cal=new ArrayList<>(Arrays.asList(givenarray));
		Set<Integer>calarray=new HashSet<>(cal);
		System.out.print(calarray);

	}

}
