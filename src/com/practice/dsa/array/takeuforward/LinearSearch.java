package com.practice.dsa.array.takeuforward;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {7,8,5,2,4,6,9};
        int target = 8;
        int result = linearSearch(arr, target);
        System.out.println("Element found at index: " + result);
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
