package com.practice.dsa.array;

import java.util.Arrays;

public class ReArrange_Even_Positions {
	public static void main(String[] args) {
//odd positioned values should be greater than even one
		int temp =0;
		int a[] = {1,2,3,4,5,6,7,8,9}; // 0123
		for(int i=1;i<a.length;i=i+2) {
			if(a[i]>a[i-1]) {
				temp = a[i];
				a[i]=a[i-1];
				a[i-1]= temp;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
