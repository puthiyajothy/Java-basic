package com.java.basic;

public class ExampleFour {

	public static void main(String[] args) {
	int []a = {2,3,4,8,6,4,4,3,9,1};
	int b[] = a;

	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a.length; j++) {
			if(a.length==b.length) {
				if(a[i] == b[i+1]) {
					a[i] = b[i];
				}
				System.out.print(a[i]);
				break;
			}
		}
		
	}
	
	
	}
	
	
	
	

}
