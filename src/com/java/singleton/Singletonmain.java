package com.java.singleton;

public class Singletonmain {

	public static void main(String[] args) {

//		A obj = new A();
//		obj.test();

//		A obj2 = A.getInstance();
//		obj2.test();

//		A obj = A.getInstance();
//		obj.test();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				A obj = A.getInstance();

			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				A obj1 = A.getInstance();
			}
		});

		t1.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		t2.start();

	}

}

class A {
	public void test() {
		System.out.println("Testting...");
	}

//	static A obj = new A();// Eager Instance
	static A obj;

	private A() {
		System.out.println("Instance Created");

	}

	public static A getInstance() { // synchronized

		if (obj == null) {
			synchronized (A.class)// Double checked locking
			{
				if (obj == null)
					obj = new A(); // lazy instance

			}

		}

		return obj;
	}
}
