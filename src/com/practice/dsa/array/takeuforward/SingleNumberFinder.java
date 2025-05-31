package com.practice.dsa.array.takeuforward;

public class SingleNumberFinder {
    public static void main(String[] args) {
        //find non duplicate number
        int[] nums = {2, 3, 2, 4, 4};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
