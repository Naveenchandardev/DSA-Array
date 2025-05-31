package com.practice.dsa.array.takeuforward;

public class KadaneAlgorithmWithSubarray {
    public static void maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        int start = 0;
        int maxStart = 0;
        int maxEnd = 0;     
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxStart = start;
                maxEnd = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                start = i + 1;
            }
        }
        System.out.println("Maximum subarray sum is " + maxSum);
        System.out.print("Subarray with max sum is: ");
        for (int i = maxStart; i <= maxEnd; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(nums);
    }
}
