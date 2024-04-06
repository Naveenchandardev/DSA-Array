package com.practice.dsa.array;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        System.out.println("Array before sorting:");
        insertionSort(array);
        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int a = array[i];
            while ((j > 0) && (array[j - 1] > a)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = a;
        }
    }
}
