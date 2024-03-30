package com.practice.dsa.array.leetcode;

import java.util.stream.IntStream;

public class Median_of_2_array {
    public static void main(String[] args) {
        int [] input1={1,2};
        int [] input2={3,4};
        double result = findMedian(input1,input2);
        System.out.println(result);
    }

    private static double findMedian(int[] nums1, int[] nums2)  {
        int totalLength = nums1.length + nums2.length;
        int[] mergedArray = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).sorted().toArray();
        if (totalLength % 2 == 0) {
            int mid = totalLength / 2;
            return (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
        } else {
            return mergedArray[totalLength / 2];
        }
    }
}
