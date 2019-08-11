package com.java.basic;

public class ArrayAssending {

	public static void main(String[] args) {
		
		int a[] = {8,9,6,5,4,67,88,90,40};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int i=a.length -1;i>=0;i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
