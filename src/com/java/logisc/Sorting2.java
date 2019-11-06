package com.java.logisc;

public class Sorting2 {

	public static void main(String[] args) {
		
		int[] a= {2,1,7,0,3};
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					
				}
			}
			 int t=a[min];
			 a[min]=a[i];
			 a[i]=t;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
