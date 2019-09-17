package com.java.basic.Builder;

public class PhoneBuilder {
	

	private String os;
	private int ram;
	private String processer;
	private double screenSize;
	private int battery;
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcesser(String processer) {
		this.processer = processer;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public Phone getphone() {
		return new Phone(os,processer,battery);
		
	}
	
	
	
	
	

}
