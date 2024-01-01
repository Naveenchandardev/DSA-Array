package com.practice.dsa.array;

import java.util.Arrays;
import java.util.Collections;

public class Second_Largest_Element {
	public static void main(String[] args) {
		//METHOD 1;
		Integer [] a = {22,17,41,1,52,69,84,75};
		Arrays.sort(a);
		System.out.println("Method 1:  Second largest element : "+a[a.length-2]);
		
		//METHOD 2: REVERSE METHOD
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Method 2: Second largest element : "+a[1]);
		
		//METHOD 3: STREAM API
		int [] input = {22,17,41,1,52,69,84,75};
		int output =Arrays.stream(input).distinct().boxed().sorted((b,c) -> c.compareTo(b)).skip(1).findFirst().orElseThrow(() -> new IllegalStateException("Array is empty"));
		System.out.println("Method 3: Second largest element : "+output);
	}
}
