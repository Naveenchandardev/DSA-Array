package com.practice.dsa.array.leetcode;

public class FindConsecutiveOdds2 {
    //https://leetcode.com/problems/three-consecutive-odds/description/?envType=daily-question&envId=2024-07-01
    public static void main(String[] args) {
        int []a={2,6,4,1};
        boolean result = solution(a);
    }
    public static boolean solution(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        return false;
    }
}
