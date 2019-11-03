package com.java.string;

public class Stringconvert {
	
	
private static String convert(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		
		for(int i=0;i<sb.length();i++) 
		{
			if(sb.charAt(i)<48 || sb.charAt(i)>57)
			{
				sb.deleteCharAt(i);
				i--;
			}

		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String str = "9457vju33";
		str = convert(str);
		System.out.println(str);
		
	}

	

}
