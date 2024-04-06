package com.practice.dsa.array;

import java.util.Arrays;

public class Remove_duplicates_Traditional {
    public static void main(String[] args){
        //REMOVE duplicates without using collections and stream;
        int[] array = {-5, 9, 3, -4, 2, 5, 2, 2, 3};
        Arrays.sort(array);
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                array[index++] = array[i];
            }
        }
        int[] distinctArray = Arrays.copyOf(array, index);
        System.out.println(Arrays.toString(distinctArray));
    }
}
