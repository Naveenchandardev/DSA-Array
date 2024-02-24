package com.practice.dsa.array;

public class Largest_3_Elements {

	public static void main(String[] args) {
		int arr[] = {25,14,17,65,39,42,62};
		int first=0, second=0,third=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				third = second; 
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second) {
				third =second;
				second = arr[i];
			}
			else if (arr[i]>third) {
				third=arr[i];
			}
		}
		System.out.println("Largest 3 number in array: - "+first +" "+second+" "+third);
	}
}
