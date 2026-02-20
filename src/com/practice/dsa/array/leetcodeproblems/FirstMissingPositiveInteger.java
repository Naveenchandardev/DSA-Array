package com.practice.dsa.array.leetcodeproblems;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {3, -1, 1,2};
        System.out.println(firstMissingPositive(arr)); // 2
    }

    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        int i = 1;
        while (true) {
            if (!set.contains(i)) {
                return i;
            }
            i++;
        }
    }

}
