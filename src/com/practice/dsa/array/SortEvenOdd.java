package com.practice.dsa.array;

import java.util.Arrays;
import java.util.Collections;
public class SortEvenOdd {
    public static void main(String[] args) {
        // Sort the array odd numbers in ascending and even numbers in descending
        Integer[] a ={1,2,3,4,5,6,7,8,9};
        Arrays.sort(a);
        Integer[] evenArray = Arrays.stream(a).filter(x->x%2==0).toArray(Integer[]::new);
        Integer[] oddArray = Arrays.stream(a).filter(x->x%2!=0).toArray(Integer[]::new);
        Arrays.sort(evenArray, Collections.reverseOrder());
        System.out.println("ASC:: "+Arrays.toString(oddArray));
        System.out.println("DESC:: "+Arrays.toString(evenArray));
    }
}
