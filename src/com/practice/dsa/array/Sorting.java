package com.practice.dsa.array;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,4};
        System.out.println("Array before sorting:");
        insertionSort(array);
        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int a = array[i];
            int j = i - 1;
            while ((j > 0) && (array[j] > a)) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = a;
        }
    }
}
