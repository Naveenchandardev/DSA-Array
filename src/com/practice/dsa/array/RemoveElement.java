package com.practice.dsa.array;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveElement {
    public static void main (String[] args) {
        int[] input = {1, 5, 6, 8, 9, 5, 6, 8};
        int remove = 5;
        int[] newArray = Arrays.stream(input).filter(x -> x != remove).toArray();
        System.out.println(Arrays.toString(newArray));
      }
}
