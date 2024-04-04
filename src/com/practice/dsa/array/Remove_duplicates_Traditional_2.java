package com.practice.dsa.array;

import java.util.Arrays;

public class Remove_duplicates_Traditional_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1};
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }

    private static int[] removeDuplicates(int[] array) {
        Arrays.sort(array);
        int uniqueCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueCount++;
            }
        }
        int[] uniqueArray = new int[uniqueCount];
        uniqueArray[0] = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueArray[index++] = array[i];
            }
        }
        return uniqueArray;
    }
}
