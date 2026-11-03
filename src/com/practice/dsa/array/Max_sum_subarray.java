package com.practice.dsa.array;

import javax.swing.plaf.basic.BasicArrowButton;

public class Max_sum_subarray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int sum = 0;
        int largest = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        largest = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum > largest) {
                largest = sum;
            }
        }
        System.out.println(largest);
    }
}
