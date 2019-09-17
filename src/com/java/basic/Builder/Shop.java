package com.java.basic.Builder;

public class Shop {

	public static void main(String[] args) {
	
		Phone p = new PhoneBuilder().setRam(5100).setProcesser("intel").getphone();
		System.out.println(p);
	}

}
