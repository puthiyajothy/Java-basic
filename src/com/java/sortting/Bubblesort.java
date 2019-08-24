package com.java.sortting;



public class Bubblesort {

	public static void main(String[] args) {
	

		int a[]={5,2,9,17,16};
		int n=a.length;
		int temp = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-1;j++) {
				if (a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}

	}

}
