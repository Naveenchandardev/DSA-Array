package com.practice.dsa.array.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonChars {

    //https://leetcode.com/problems/find-common-characters/?envType=daily-question&envId=2024-06-05
    public static void main(String[] args) {
        String[] input = {"bella", "label", "roller"};
        System.out.println(commonChars(input));     }

    public static List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        if (A == null || A.length == 0) return result;

        // Initialize frequency map with the first string
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (String s : A) {
            int[] charCount = new int[26];
            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }
        // Build the result list based on the frequency map
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add("" + (char)(i + 'a'));
                minFreq[i]--;
            }
        }
        return result;
    }
}
