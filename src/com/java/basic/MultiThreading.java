package com.java.basic;


class ab extends hi {
	
}


class hi extends Thread  {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("welcome To Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class hellow extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hellow....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		
		hi Obj = new hi();
		hellow Obj1 = new hellow();
		
	
		
//		Obj.show();
//		Obj1.show();
		
		Obj.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		Obj1.start();
		

	}

}
