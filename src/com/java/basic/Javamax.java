package com.java.basic;

import java.util.logging.Logger;

public class Javamax {

	@SuppressWarnings("unused")
	private static Logger logger;
	public static void main(String[] args) {
	
		int a []= {5,8,9,3,4,2};
		
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		for(int i=0;i<a.length;i++) {
			System.out.print(" "+ a[i]);
		}
		
		System.out.println();
		
		int max = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			max=a[i];
		}
		
		System.out.print(max);
		System.out.println();
		System.out.print(a[1]);
	}

}
