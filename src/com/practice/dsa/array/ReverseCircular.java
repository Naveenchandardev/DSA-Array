package com.practice.dsa.array;

import java.util.Arrays;

public class ReverseCircular {

	public static void main(String[] args) {
		int [] a = {2,5,8,9,6,5,4,1,2};
		int n= a.length;
		int [] b = new int [a.length];
		int position = 4;
		for(int i=0;i<n;i++) {
			if(position<n ) {
				b[i]= a[position];position++;
			}
			else if(position==a.length) {
				position=0;b[i]= a[position];position++;
				
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
