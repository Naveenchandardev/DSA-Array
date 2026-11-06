package com.practice.dsa.array.takeuforward;

public class Max_subarray_consecutive_with_k_3 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int largest = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            if (sum > largest) {
                largest = sum;
            }
        }
        System.out.println(largest);
    }
}
