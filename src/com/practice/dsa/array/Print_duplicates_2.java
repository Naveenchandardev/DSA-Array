package com.practice.dsa.array;

import java.util.Arrays;

public class Print_duplicates_2 {
    public static void main(String[] args) {
        int []array={1,2,5,4,4,4,4,9};
        Arrays.sort(array);
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] == array[i + 1]) {
                System.out.println(array[i]);
                while (i < array.length - 1 && array[i] == array[i + 1]) {
                    i++;
                }
            }
            i++;
        }
    }
}
