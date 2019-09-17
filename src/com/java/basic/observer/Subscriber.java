package com.java.basic.observer;

public class Subscriber implements Observer {
	private String name;
	private Channel channel;

	public Subscriber(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hey "+ name +",video Uploaded: "+channel.title);
	}

	@Override
	public void subscribeChannel(Channel ch) {
		channel= ch;
	}

	@Override
	public String toString() {
		return "Subscriber [name=" + name + "]";
	}
	
	
}
