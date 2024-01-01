package com.practice.dsa.array;

import java.util.Arrays;
import java.util.Collections;

public class Two_Pointer_Array_Sort { 
	static void rearrange(int[] arr, int n){
		int temp[] = arr.clone();
		int small = 0, large = n - 1;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (flag)
				arr[i] = temp[large--];
			else
				arr[i] = temp[small++];
			flag = !flag; // in each loop its dynamically changed true or false for each loop
		}
	}
	public static void main(String[] args){
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(arr));
		rearrange(arr, arr.length);
		System.out.println("Modified Array ");
		System.out.println(Arrays.toString(arr));
	} 
}
