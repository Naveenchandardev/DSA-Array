package com.practice.dsa.array;

import java.util.Arrays;

public class Remove_duplicates_Traditional {
    public static void main(String[] args){
        int[] array = {-1, 2, 3, 4, 2, 5, 6, 1, 3};
        Arrays.sort(array);
        int previous = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != previous) {
                array[index++] = array[i];
                previous = array[i];
            }
        }
        // Create a new array containing distinct elements
        int[] distinctArray = Arrays.copyOf(array, index);
        // Print distinct elements
        System.out.println(Arrays.toString(distinctArray));
    }
}
