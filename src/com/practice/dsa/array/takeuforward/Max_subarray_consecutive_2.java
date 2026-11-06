package com.practice.dsa.array.takeuforward;

public class Max_subarray_consecutive_2 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int sum = 0;
        int maxSum = 0;
// Calculate first window sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = sum;
// Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
