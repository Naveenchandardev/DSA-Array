package com.practice.dsa.array;

import java.util.Arrays;

public class MinandMax {
	public static void main(String[] args) {
		  int a[] = { 1, 5, 6, 46, 34, 23, 13, 53};
		  //METHOD 1;
		  Arrays.sort(a);
		  System.out.println("Method 1 - Min of array is : "+a[0]);
		  System.out.println("Method 1 - Max of array is : "+a[a.length-1]);
		  System.out.println();

		  //METHOD 2;
		System.out.println("Method 2 - Min of array is : "+getMin(a,a.length));
		System.out.println("Method 2 - Max of array is : "+getMax(a,a.length));
	}

	  static int getMin(int arr[], int n) {
	        return Arrays.stream(arr).min().getAsInt();
	    }
	  static int getMax(int arr[], int n) {
	        return Arrays.stream(arr).max().getAsInt();
	    }

}
