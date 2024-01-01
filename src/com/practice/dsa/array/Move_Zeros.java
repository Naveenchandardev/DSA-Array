package com.practice.dsa.array;
import java.util.Arrays;

public class Move_Zeros {
	public static void main(String[] args) {
		int a[] = {4,5,0,6,8,0,9,8,0,7,5};
		myMethod(a,a.length-1);
		method2(a,a.length);
	}

	private static void myMethod(int[] a, int n) {
		int m=0;int b[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]==0){
				b[n]=a[i];
				n--;
			}else {
				b[m]=a[i];
				m++;
			}
		}
		System.out.println("Method 1 results: "+Arrays.toString(b));		
	}
	
	private static void method2(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; 
        while (count < n) 
            arr[count++] = 0; 
    	System.out.print("Method 2 result : ");
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+", "); 
	}

}
