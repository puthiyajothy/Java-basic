package com.java.logisc;

public class Reverseprint {

	public static void main(String[] args) {
		int a []= {5,8,9,3,4,2};
		
		int max = a[0];
		int min = a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
			max=a[i];
			}if (a[i] < min) {
				min = a[i];

			}
			
		}
			
		System.out.print(max);
		
		
		System.out.print(min);
		System.out.println();
		
		
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]);
//		}
		
		
		
		System.out.println();
		int temp;
		for (int i=0 ; i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
}