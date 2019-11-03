package com.java.basic;

public class Javastring {

	public static void main(String[] args) {

		String s = "jothi";
		String s1="jothi";
		
		StringBuffer sb2=new StringBuffer("jothi"); 
		StringBuffer sb=new StringBuffer("jothi");  
		 boolean s8=sb.equals(s1);
		
		 
		 
		 
		System.out.println();
		System.out.println(s8);
		
		System.out.println(s==s1);
		
		 String s3=new String("jothi");  
		 System.out.println(s1==s3);
		 
		 char  k=(char) (s.charAt(1)-32);
		 System.out.println(k);
		// System.out.println(k-32);
		 
		 
		 
		String str="abc xyz lmn";
		char ch[]=str.toCharArray();
		ch[0]=(char) (ch[0]-32);
		for(int i=0;i<str.length();i++) {
			if(ch[i]==' ') {
				ch[i+1]=(char) (ch[i+1]-32);
			}
		}
		System.out.println(ch);
		
		s.concat("jo");
		System.out.print(s);
		
		System.out.println();
		
		System.out.println(s.concat("dilu" + "concat:"));
		System.out.println();
		System.out.println(s.compareTo("j"));
		
		System.out.println(s.replace("jothi", "dilu" + "Replace :"));
		System.out.println();
		
		System.out.println(  " intern :" + s.intern());
		
		System.out.println();
		System.out.println(s.equals("equals:" + s));
		
		System.out.println();
		System.out.println(s.length() + " Length");
		
		System.out.println();
//		System.out.println(s.split(s));
	
	
		System.out.println();

		
		
	}

}
