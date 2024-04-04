package com.practice.dsa.array;

import java.util.Arrays;

public class Remove_duplicates_Traditional {
    public static void main(String[] args){
        int[] array = {-1, 2, 3, 4, 2, 5, 6, 1, 3};
        Arrays.sort(array);
        int previous = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != previous) {      // If the current element is different from the previous one
                array[index++] = array[i];   // Store the current element
                previous = array[i]; // Update the previous element
            }
        }
        // Create a new array containing distinct elements
        int[] distinctArray = Arrays.copyOf(array, index);
        // Print distinct elements
        System.out.println(Arrays.toString(distinctArray));
    }
}
