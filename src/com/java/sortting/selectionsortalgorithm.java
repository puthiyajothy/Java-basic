package com.java.sortting;

public class selectionsortalgorithm {

	public static void main(String[] args) {
		int[] a= {7,5,2,4,3,9};
		
		
		int temp =0;
		
		for(int i=0; i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
