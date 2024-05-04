package com.practice.dsa.array.leetcode;

import java.util.HashSet;

public class LargestPositiveInteger {
    public static void main(String[] args) {
        int a[]={-1,10,6,7,-7,1};
        int result =checkCondition(a);
        System.out.println(result);
    }

    private static int checkCondition(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = -1;
        for(int num : nums){
            hs.add(num);
            int k = num*(-1);
            if(hs.contains(k)){
                ans = Math.max(ans,Math.abs(num));
            }
        }
        return ans;
    }
}
