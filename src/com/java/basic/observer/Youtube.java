package com.java.basic.observer;

public class Youtube {

	public static void main(String[] args) {
		
		Channel telusko = new Channel();
		
		Subscriber s1 = new Subscriber("jo");
		Subscriber s2 = new Subscriber("jothi");
		Subscriber s3 = new Subscriber("dilu");
		
		telusko.Subscribe(s1);
		telusko.Subscribe(s3);
		telusko.Subscribe(s2);
		
		s1.subscribeChannel(telusko);
		s2.subscribeChannel(telusko);
		s3.subscribeChannel(telusko);
		
		telusko.upload("How to learn Java?..");

	}

}
