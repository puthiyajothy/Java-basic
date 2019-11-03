package com.java.string;

public class tostringmethod {

	public static void main(String[] args) {
		
		student s1 = new student(1,"tyronne");
		System.out.println(s1);

	}

}

class student{
	
	int rollno;
	String sname;
	
	public student(int rollno, String sname) {
		this.rollno = rollno;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", sname=" + sname + "]";
	}
	
	
	
}
