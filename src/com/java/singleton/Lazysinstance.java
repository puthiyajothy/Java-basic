package com.java.singleton;

public class Lazysinstance {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			
			public void run() {

				@SuppressWarnings("unused")
				Mengo mengo = Mengo.getinstance();
//				mengo.dance();

			}

		});

		Thread t2 = new Thread(new Runnable() {

		
			public void run() {

				@SuppressWarnings("unused")
				Mengo mengo = Mengo.getinstance();
//				mengo.dance();

			}

		});

		t1.start();
		t2.start();
	}

}

class Mengo {

	public void dance() {
		System.out.println("Dancing.. ");
	}

	static Mengo mengo = new Mengo();

	
	private Mengo() {
		System.out.println("Const Created..");

	}


	public static synchronized Mengo getinstance() {// lezy Instance

		if (mengo == null)
		{
			mengo = new Mengo();
		}
		return mengo;

	}

}