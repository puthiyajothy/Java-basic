package com.java.basic;

public class Stringbuffer {

	public static void main(String[] args) {

//		String str="tyronne";

		StringBuffer sb = new StringBuffer("tyronne");// StringBuffer is thread safe

		sb.append("Dilu");
		sb.replace(0, 1, "j");
		sb.deleteCharAt(1);
		sb.reverse();
		System.out.println(sb);

		System.out.println();

		StringBuilder sbl = new StringBuilder("Dilu");
		sbl.append("jothi");
		sbl.replace(1, 2, "jo");
		System.out.println(sbl);

	}

}
