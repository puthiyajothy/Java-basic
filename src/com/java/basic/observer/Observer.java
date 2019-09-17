package com.java.basic.observer;

public interface Observer {

	String getName();

	void setName(String name);

	void update();

	void subscribeChannel(Channel ch);

}