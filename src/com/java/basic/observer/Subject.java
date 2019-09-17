package com.java.basic.observer;

public interface Subject {

	void Subscribe(Subscriber sub);

	void unSubscriber(Observer sub);

	void notifySubscriber();

	void upload(String title);

}