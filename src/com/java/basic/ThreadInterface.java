package com.java.basic;

class apple implements Runnable,dev{

	public void run() {
		int b[] = { 2, 5, 6, 9, 10 };

		for (int i = 0; i < b.length; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Apple -> " + b[i]);

		}

	}

}

 class abc implements Runnable{

	public void run() {
		int a[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("abc->  " + a[i]);

		}
	}

}

public class ThreadInterface {

	public static void main(String[] args) {

		Runnable Obj = new abc();
		Runnable Obj1 = new apple();

		Thread t1 = new Thread(Obj);
		Thread t2 = new Thread(Obj1);

		t1.start();
		System.out.println();
		t2.start();

	}

}

interface dev {
	
}

interface dev2 extends dev{
	
}
