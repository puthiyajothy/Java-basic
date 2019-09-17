package com.java.basic.Builder;

public class Phone {

	private String os;
	private int ram;
	private String processer;
	private double screenSize;
	private int battery;
	
	public Phone(String os, String processer, double screenSize) {
		super();
		this.os = os;
		this.ram = ram;
		this.processer = processer;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processer=" + processer + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}

	

	
	
	
}
