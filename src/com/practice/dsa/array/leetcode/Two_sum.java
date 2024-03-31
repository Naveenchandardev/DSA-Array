package com.practice.dsa.array.leetcode;

import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
        int [] input1= {3,2,4};
        int target=6;
        int []result = findResult(input1, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findResult(int[] nums, int target) {
        int []result = new int[2];
        System.out.println(nums.length);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
