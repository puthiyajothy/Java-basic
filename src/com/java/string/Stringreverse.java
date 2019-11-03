package com.java.string;

public class Stringreverse {

	public static void main(String[] args) {


		String str = "jothi";
		
		
		StringBuffer stringb = new StringBuffer(str);
		String str11 =stringb.reverse().toString();
		System.out.println(str11);
		

		
		String text = "jothi";
		String pa ="A";
		
		boolean result = text.contains(pa);
		if(result)
			System.out.println("result found");
		else
			System.out.println("result not found");
		

	}

}
