package com.practice.dsa.array;

import java.util.Arrays;

public class Segregate_Even_Odd {
	public static void main(String[] args) {
		int [] a = {2,5,4,8,9,6,3,5,7};
		myMethod(a, a.length);
	}

	// METHOD 1:
	private static void myMethod(int[] a, int length) {
		int [] c = a.clone();
		int finalkey =a.length-1; int m=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				c[m]=a[i];m++;
			}
			else {
				c[finalkey]=a[i];
				finalkey --;
			}
		}
		System.out.println(Arrays.toString(c));		
	}
}
