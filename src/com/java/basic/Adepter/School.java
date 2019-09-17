package com.java.basic.Adepter;

public class School {

	public static void main(String[] args) {
	Pen p = new PenAdopter();
	AssignmentWork aw = new AssignmentWork();
	aw.setP(p);
	aw.writeAssignment("I am writting");

	}

}
