package com.java.basic;

public class Basicclass extends mainclass {

	public static void main(String[] args) {

		mainclass Obj = new mainclass();
		Obj.setId(1);
		Obj.setName("tyronne");
		System.out.println(Obj.getId()+" " + Obj.getName());

	}

}

class mainclass {

	private int id;
	private String name;

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

	public mainclass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public mainclass() {
		super();
	}

	public String toString() {
		return id + " " + name;

	}

}
