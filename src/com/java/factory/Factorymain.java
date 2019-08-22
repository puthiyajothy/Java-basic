package com.java.factory;

public class Factorymain {

	public static void main(String[] args) {
		
		factoryclass fcObj = new factoryclass();
		OS obj = fcObj.getInstance("Closed");
		obj.spec();

	}

}
