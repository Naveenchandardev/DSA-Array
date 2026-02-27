package com.practice.dsa.array.GeeksforGeeks;

public class FirstMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        System.out.println("Smallest missing element is " +
                findFirstMissing(arr));
    }
    static int findFirstMissing(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i)
                return i;
        }
        return n;
    }

}
