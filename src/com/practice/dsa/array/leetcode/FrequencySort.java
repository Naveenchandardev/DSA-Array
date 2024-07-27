package com.practice.dsa.array.leetcode;

import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        //https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] sorted = frequencySort(nums);
        System.out.println(Arrays.toString(sorted)); // Output: [3, 1, 1, 2, 2, 2]
    }
    private static int[] frequencySort(int[] nums) {
        // Count the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list of integers from the array
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }Collections.sort(numsList, (a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB);
            } else {
                return Integer.compare(b, a);
            }
        });
        int[] sortedArray = new int[numsList.size()];
        for (int i = 0; i < numsList.size(); i++) {
            sortedArray[i] = numsList.get(i);
        }
        return sortedArray;
    }
}
