package com.java.javaoop;


public class Abstract {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		c obj = new c();
		obj.tot();
		System.out.println();
		obj.dance();
	

	}

}


abstract class abc {
	public int sum() {
		return 0;
	}
	
	public abstract void tot();
	
	public static void dance() {
		System.out.print("hellow");
	}
}


interface b{
	public default int sum() {
		return 0;
	}
	
	public static int tot() {
		return 0;
	}
	
	public abstract void total();
}

class c extends abc {
	public void man() {
		System.out.print("dance ");
	}

	@Override
	public void tot() {
		System.out.print("well done ...");
	}

	
}
