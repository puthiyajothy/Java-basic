package com.java.singleton;

public class Enumsingleton {

	public static void main(String[] args) {
		
		Abc obj5 = Abc.INSTANCE;
		obj5.i=5;
		obj5.show();
		
		Abc obj6 = Abc.INSTANCE;
		obj6.i=6;
		obj5.show();


	}

}

enum Abc { //It Will have private con Already
	
	INSTANCE;
	
	int i;
	
	public void show() {
		System.out.println(i);
	}
	
}