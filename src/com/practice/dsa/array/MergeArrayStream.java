package com.practice.dsa.array;
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArrayStream {
	public static void main(String[] args) {
		Integer[] input1 = { 1, 5, 3 };
		Integer[] input2 = { 2, 4, 6 };
		Object[] mergedArray = mergeArray(input1, input2);
		System.out.println("Merged array: " + Arrays.toString(mergedArray));
	}

	public static <T> Object[] mergeArray(T[] arr1, T[] arr2) {
		return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();
	}

}
