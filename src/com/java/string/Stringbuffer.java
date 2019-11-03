package com.java.string;

public class Stringbuffer {

	public static void main(String[] args) {

	StringBuffer stringb = new StringBuffer("jothi");
//	stringb.append("dilu");
//	stringb.charAt();
    String s1=	stringb.substring(1);
    String s2=stringb.subSequence(0,2).toString();
	System.out.println(stringb);
	System.out.println(s1);
	System.out.println(s2);
	
	}

}
