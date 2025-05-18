package com.practice.dsa.array;

import java.util.TreeSet;

public class SecondLargestChar {
    public static void main(String[] args) {
        String input = "pppppbbbbaa";
        char secondLargest = findSecondLargestChar(input);
        System.out.println("Second largest character: " + secondLargest);
    }
    public static char findSecondLargestChar(String str) {
        TreeSet<Character> set = new TreeSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        if (set.size() < 2) {
            throw new IllegalArgumentException("No second largest character found");
        }
        return set.lower(set.last());
    }
}
