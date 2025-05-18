package com.practice.dsa.array.leetcodeTwo;

public class TwoPointer_Problem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 10, 12};
        int target = 9;
        System.out.println(hasPairWithSum(arr, target));
    }
    public static boolean hasPairWithSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println( arr[left] + " and "+arr[right]);
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
