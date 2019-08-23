package com.java.searching;

public class Linearsearch {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		int i;
		int key=30;
		int [] a= {1,3,4,6,7};	
		
		for(i=0;i<a.length;i++) {
			if(a[i]==key);
			{
				System.out.println("element is found:" + a[i]);
				
				break;
			}
			
		}
		
		if(i==a.length) {
			System.out.println("Element not found");
		}
	}

}
